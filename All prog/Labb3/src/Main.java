import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * Here in main the player is created, his/hers values are set and the menu is created.
     * @param args
     */
    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("* WELCOME TO THE GAME *");
        System.out.println("***********************");
        System.out.println("Enter your name:");

        String playerName = sc.nextLine();

        Player player = new Player(1, 100, 0, 100, 100, playerName, 0, 0);
        Store store = new Store(50);

        boolean menu = false;

        do

        {

            System.out.println("1. Go adventuring");
            System.out.println("2. Show details about your character");
            System.out.println("3. Enter shop");
            System.out.println("4. Exit game");


            int menuChoice = sc.nextInt();

            switch (menuChoice) {

                case 1:
                    goAdventure(player);
                    break;

                case 2:
                    player.printPlayer(playerName);
                    break;

                case 3:
                    System.out.println("Old lady: Welcome to my store");
                    System.out.println("Potions are 50 gold, would you like to buy one?");
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    int storeAnswer = sc.nextInt();

                    boolean potionShop = false;

                    do {

                        if (storeAnswer == 1) {
                            System.out.println("Good... good... here you are!");
                            Player.potions += 1;
                        } else if (storeAnswer == 2) {
                            System.out.println("Get the hell out of here then!");
                        } else {
                            System.out.println("Try again");
                        }

                    }while(!potionShop);


                case 4:
                    System.out.println("Bye bye");
                    menu = true;
                    break;

                default:
                    System.out.println("Try again");


            }


        }while(!menu);


    }

    /**
     *  Here´s the whole adventure part of the program where you fight, die, get experience etc.
     * @param player Current player.
     */
    public static void goAdventure(Player player) {


        Scanner sc = new Scanner(System.in);

        Random random1 = new Random();       //Generate random procent for swaying grass
        Random random2 = new Random();       //Generate random player damage
        Random random3 = new Random();       //Generate random orc damage
        Random random4 = new Random();       //Generate random exp drop
        Random random5 = new Random();       //Generate random gold drop from monster

        Orc orc = new Orc("Orc", 50, 80, 50);

        int goldDrop = random5.nextInt(Orc.maxGoldDrop - 30 ) + 30;
        int procent = random1.nextInt(100);
        int randomExpDrop = random4.nextInt(orc.maxExpDrop - 50) + 50;


          if(procent <= 10) {

              System.out.println("You see nothing but swaying grass all around you...");
              System.out.println("[Press enter to continue]");
              var enter = sc.nextLine();

          }

          else {

              System.out.println("Oh crap! A raging " + orc.name + " appeared!");

              boolean fight = false;

              do

              {

                  int orcDamageHigh = 30;
                  int orcDamageLow = 5;
                  int playerDamageHigh = 25;
                  int playerDamageLow = 5;


                  if(Player.currentLevel >= 3) {
                      orcDamageHigh = orcDamageHigh + 10;
                  }
                  else if(Player.currentLevel >= 6) {
                      orcDamageHigh = orcDamageHigh + 10;
                  }
                  else if(Player.currentLevel >= 9) {
                      orcDamageHigh = orcDamageHigh + 20;
                  }


              int randomPlayerDamage = random2.nextInt(playerDamageHigh - playerDamageLow) + playerDamageLow; //Here the program randomize the players damage
              int randomOrcDamage = random3.nextInt(orcDamageHigh - orcDamageLow) + orcDamageLow;             //Here the program randomize the orcs damage



              System.out.println("You strike the ugly creature, dealing " + randomPlayerDamage + " damage!" );

                orc.hp = orc.hp - randomPlayerDamage;
                if(orc.hp <= 0) {
                    System.out.println("You´ve slayed the beast and get: " + randomExpDrop + " exp and " + goldDrop + " gold!");
                    fight = true;
                    Player.exp += randomExpDrop;
                }

                else {

                    System.out.println("ROAAAAAR");
                    System.out.println("The monster hit you, dealing " + randomOrcDamage + " damage!");

                    player.hp = player.hp - randomOrcDamage;
                    if (player.hp <= 0) {
                        System.out.println("You where killed by the beast!");
                        System.out.println("GAME OVER");
                        System.exit(0);
                    }

                    System.out.println(Player.name + " hp: " + player.hp);
                    System.out.println(orc.name + " hp: " + orc.hp);
                    System.out.println("[Press enter to continue]");
                    var enter = sc.nextLine();

                }

                player.levelUp();

              }while(!fight);


          }

    }



}






