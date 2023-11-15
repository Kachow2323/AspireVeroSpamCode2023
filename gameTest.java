import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;
public class gameTest {

    //scanner

    static int maxEnemyRange = 10;
    static int minEnemyRange = 1;
    static int enemyRange = maxEnemyRange - minEnemyRange + 1;

    //enemy types
    static boolean enemyPresent;
    static int enemyhp;
    static int enemyDamage;

    //enemy 1 stats
    static int enemy1Damage = 3;
    static int enemy1hp = 5;
    
    //enemy 2 stats
    static int enemy2Damage = 5;

    //player stats
    static int playerHp = 10;
    static int playerDamage = 3;
    static int money;

    //actions

    public static void main(String []args) {
        //enemy type spawn chance
        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("Print Your Name");
        String nameInput = Scanner1.nextLine();     
        System.out.println(nameInput + " has entered the battelfield!");
        System.out.println("Health: " + playerHp);

        while (playerHp > 0){
            System.out.println("(Re)Enter the Battlefield (1) - Shop (2)");
            int Entrance = Scanner1.nextInt();
                if (Entrance == 1) {
                    int randEnemy = 1;
                
                    // double randEnemy = (int)(Math.random() * enemyRange) + minEnemyRange;
                    if (randEnemy == 1){
                        enemyPresent = true;
                        enemyhp = enemy1hp;
                        enemyDamage = enemy1Damage;
                        System.out.println("An infected civilian has appeared. Hp: 5 Dmg: 1");
                        } else if (randEnemy == 1){
                            enemyPresent = true;
                            enemyhp = enemy1hp;
                            enemyDamage = enemy1Damage;
                            System.out.println("An infected civilian has appeared. Hp: 5 Dmg: 1");//else if{}
                            //fill out rest of the enemies here 
                            actionChoice();
                            if(enemyPresent = true){
                            actionChoice();
                            }
                            }else{
                            System.out.println("Game Over!");
             }       
            }
        
        
        private static void actionChoice(){
            System.out.println("Shoot weapon (1) or Find Ammo (2)? ");
            Scanner Scanner1 = new Scanner(System.in);
            int waveChoice = Scanner1.nextInt();
            if(waveChoice == 1){
            System.out.println("Shooting...");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            enemyhp = enemyhp - playerDamage;
            System.out.println("Enemy 1 hp: " + enemyhp);
            }
            if(enemyhp == 0){
                enemyPresent = false;
                enemyhp = 0;
                enemyDamage = 0;

            }else{
                playerHp = playerHp - enemyDamage;
                System.out.println("Player Hit! HP: "+ playerHp);
            }

    }
}
