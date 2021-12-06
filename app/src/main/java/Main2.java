import jp.ac.uryukyu.ie.e175707.*;

public class Main2 {
    public static void main(String[] args){
        Warrior warrior = new Warrior("戦士", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        String heroName = warrior.getName();
        String enemyName = enemy.getName();

        System.out.printf("%s vs. %s\n", heroName, enemyName);

        int turn = 0;
        while( warrior.getDead() == false && enemy.getDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackwithWeponSkill(enemy);
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }
}