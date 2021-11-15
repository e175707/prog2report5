package jp.ac.uryukyu.ie.e175707;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 *  Created by e175707 on 2021/11/15.
 */
public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * 攻撃する前に自身が死んでいるのなら、攻撃力を０にする。
     * @param hero 攻撃対象
     */
    public void attack(Hero hero){
        if(hitPoint>0){
        String heroName = hero.getName();
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, heroName, damage);
        hero.wounded(damage);
        }
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
            System.out.printf("モンスター%sは倒れた。\n", name);
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
     * @param _hitPoint 変更後のHP。
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
     * 自身の生死状態を設定するメソッド。true=死亡。
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