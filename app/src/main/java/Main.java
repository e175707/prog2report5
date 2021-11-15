import jp.ac.uryukyu.ie.e175707.*;

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        String heroName = hero.getName();
        String enemyName = enemy.getName();

        System.out.printf("%s vs. %s\n", heroName, enemyName);

        int turn = 0;
        while( hero.getDead() == false && enemy.getDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}