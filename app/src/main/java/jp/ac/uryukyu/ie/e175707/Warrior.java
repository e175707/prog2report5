package jp.ac.uryukyu.ie.e175707;

/**
 * 戦士クラス。
 *  Created by e175707 on 2021/12/6.
 */
public class Warrior extends LivingThing{
    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     *自身へ攻撃されたときのダメージ処理をするメソッド。  */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは道半ばで力尽きてしまった。\n", getName());
        }
    }    
    public void attackwithWeponSkill(LivingThing opponent){
        if( !dead ){
            int damage = (int)( 1.5 * getAttack());
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

}