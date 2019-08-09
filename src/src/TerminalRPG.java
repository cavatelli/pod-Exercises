import java.util.Scanner;


public class TerminalRPG {
    public static void main(String[] args) {
        //Ask the user if they would like to play a game
        System.out.println("Would you like to play a game *In Jigsaws voice* y/n");
        Scanner wantToPlay = new Scanner(System.in);
        String wantsToPlay = wantToPlay.next();
        boolean confirmation =wantsToPlay.equals("y");
        if(confirmation){
            //Ask the user to name their character
            System.out.println("What would you like to name your character?");
            Scanner nameScanner = new Scanner(System.in);
            String charName = nameScanner.next();
            System.out.println("You choose " + charName + " as your name.  Guess you aren't great at making decisions");

            int charHealth = (int)(Math.random() * 5 + 15);
            int charAttack = (int)(Math.random() * 3 + 5);
            int charDef = (int)(Math.random() * 3 + 2);
            System.out.println(charName + "'s health is " + charHealth + " and " + charName + "'s attack is " + charAttack + " and " +
                    charName + "'s defense is " + charDef);

            //Enemy stats

            int spiderHealth = 7;
            int spiderAttack = 4;
            int spiderDefense = 0;

            int goblinHealth = 10;
            int goblinAttack = 5;
            int goblinDefense = 1;

            int trollHealth = 20;
            int trollAttack = 8;
            int trollDefense = 2;

            int zombieHealth = 35;
            int zombieAttack = 4;
            int zombieDefense = 4;

            int enemyHP;
            int enemyAtt;
            int enemyDef;

            //Picking an enemy to spawn

            int pickEnemy = (int)(Math.random() * 4 + 1);
            System.out.println(pickEnemy);

            switch(pickEnemy){
                case 1:
                    enemyHP = spiderHealth;
                    enemyAtt = spiderAttack;
                    enemyDef = spiderDefense;
                    break;
                case 2:
                    enemyHP = goblinHealth;
                    enemyAtt = goblinAttack;
                    enemyDef = goblinDefense;
                    break;
                case 3:
                    enemyHP = trollHealth;
                    enemyAtt = trollAttack;
                    enemyDef = trollDefense;
                    break;
                case 4:
                    enemyHP = zombieHealth;
                    enemyAtt = zombieAttack;
                    enemyDef = zombieDefense;
                    break;
            }
            System.out.printf("A %s has spawned", theEnemy);
            Scanner combatScan = new Scanner(System.in);
            System.out.println("Would you like to fight or run? f/r");
            String theFight = combatScan.next();
            boolean fightConfirmation = theFight.equals("f");


            //Calculating damage
            int userDamage = charAttack - enemyDef;
            int enemyDamage = enemyAtt - charDef;
//            if(fightConfirmation){
//                for(int i = charHealth; i > 0; i - userDamage)
//            }
        }
    }

}

