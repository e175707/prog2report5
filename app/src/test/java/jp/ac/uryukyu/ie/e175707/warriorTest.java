package jp.ac.uryukyu.ie.e175707;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
     
class WarriorTest {
   @Test
   void attackwithWeponSkillTest() {
    int defaultWarriorAttack = 100;
    int previousEnemyHitPoint;
    Warrior demoWarrior = new Warrior("デモ戦士", 400, defaultWarriorAttack);
    Enemy slime = new Enemy("スライムもどき", 450, 100);
    for(int i = 0; i < 3; i++){
        previousEnemyHitPoint = slime.hitPoint;
        demoWarrior.attackwithWeponSkill(slime);
        slime.attack(demoWarrior);
        assertEquals(previousEnemyHitPoint - slime.hitPoint, (int)(1.5 * defaultWarriorAttack));
    }
}
}
