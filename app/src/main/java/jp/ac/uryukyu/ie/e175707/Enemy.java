package jp.ac.uryukyu.ie.e175707;

/**
 * 敵クラス。
 *  Created by e175707 on 2021/12/6.
 */
public class Enemy extends LivingThing{
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}