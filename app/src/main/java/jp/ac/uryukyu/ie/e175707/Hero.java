package jp.ac.uryukyu.ie.e175707;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 *  Created by e175707 on 2021/11/15.
 */
public class Hero {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(Enemy e){
        String eName = e.getName();
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, eName, damage);
        e.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }

    /**
     * 自身の名前を設定するメソッド。
     * @param name　変更後の名前。
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * 自身のHPを設定するメソッド。
     * @param hitPoint　変更後のHP。
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    /**
     * 自身の攻撃力を設定するメソッド。
     * @param attack　変更後の攻撃力。
     */
    public void setAttack(int attack){
        this.attack = attack;
    }

    /**
     * 自身の生死状態を設定するメソッド。
     * @param dead　変更後の生死状態。
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }

    /**
     * 自身の名前を参照するメソッド。
     * @return　自身の名前。
     */
    public String getName(){
        return this.name;
    }

    /**
     * 自身のHPを参照するメソッド。
     * @return　自身のHP。
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * 自身の攻撃力を参照するメソッド。
     * @return　自身の攻撃力。
     */
    public int getAttack(){
        return this.attack;
    }

    /**
     * 自身の生死状態を参照するメソッド。
     * @return　自身の生死状態。
     */
    public boolean getDead(){
        return this.dead;
    }
}