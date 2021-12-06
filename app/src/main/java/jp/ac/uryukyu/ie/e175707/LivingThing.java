package jp.ac.uryukyu.ie.e175707;

public class LivingThing {
    private String name;
    public int hitPoint;
    private int attack;
    public boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 指定キャラの名前
     * @param maximumHP 指定キャラのHP
     * @param attack 指定キャラの攻撃力
     */
    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    
    /**
     * メンバ変数nameを取得する
     * @return name
     */
    public String getName(){
        return name;
    }


    /**
     * メンバ変数hitPointを取得する
     * @return hitPoint
     */
    public int getHitPoint(){
        return hitPoint;
    }


    /**
     * メンバ変数attackを取得する
     * @return attack
     */
    public int getAttack(){
        return attack;
    }

    /**
     * メンバ変数deadを取得するメソッド
     * @return　取得したいdead
     */
    public boolean getDead(){
        return dead;
    }

   

    /**
     * Heroへ攻撃するメソッド。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        if(hitPoint > 0){
        int damage = (int)(Math.random() * attack);
        
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name,opponent.getName(), damage);
        opponent.wounded(damage);
    }
    }

    /**
     * Enemyから攻撃されたときのダメージ処理をするメソッド。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    public boolean isDead(){
        return isDead();
    }

}
