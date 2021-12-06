package jp.ac.uryukyu.ie.e175707;

/**
 * ヒーロークラス。
 *  Created by e175707 on 2021/12/6.
 */
public class Hero extends LivingThing{
    public Hero (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     *自身へ攻撃されたときのダメージ処理をするメソッド。
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }    

}