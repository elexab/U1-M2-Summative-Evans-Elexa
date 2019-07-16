import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //CREATE VARIABLES
        String player;
        String name;
        int enemyHealth = 100;


        //SCANNER STATEMENT
        Scanner scanner = new Scanner(System.in);

        //CREATE AN OBJECT OF SUBCLASSES TO USE ITS VARIABLES AND METHODS
        Farmer f = new Farmer();
        Constable c = new Constable();
        Warrior w = new Warrior();

        //PRINTS INTRO OF GAME
        System.out.println("THE END OF THE WORLD GAME");
        System.out.println("It is the end of the world as we know it. ");
        System.out.println("Now we must find a way to survive on what was once called " +
                        "Earth. ");
        System.out.println("Problem is, we must choose a ruler. ");
        System.out.println("In order to do so, we must go to war and the winner will rule" +
                " the world.");
        System.out.println();

        //ASKS USER TO ENTER THEIR NAME
        System.out.println("Please Enter Your Name: ");
        name = scanner.nextLine();

            System.out.println();
            System.out.println("Welcome "+ name +"!");
            System.out.println();
            //ASKS USER TO CHOOSE PLAYER
            System.out.println("Please Choose Your Player: ");
            System.out.println("Farmer, Constable, Warrior");
            player = scanner.nextLine();

            //RUN FARMER METHODS
            if(player.equals("farmer")){
            do {
                System.out.println();
                System.out.println("Please Enter Your Action: ");
                System.out.println("Run, Attack, Heal, Decrease Stamina, " +
                        "Increase Stamina, Decrease Health, Plow, Harvest");
                String action = scanner.nextLine();
                if (action.equals("run")) {
                    f.run();
                } else if (action.equals("attack")) {
                    f.attack();
                    enemyHealth -= 25;
                    System.out.println("Your enemy health is " + enemyHealth + ".");
                } else if (action.equals("heal")) {
                    f.heal();
                } else if (action.equals("decrease stamina")) {
                    f.decreaseStamina();
                } else if (action.equals("increase stamina")) {
                    f.increaseStamina();
                } else if (action.equals("decrease health")) {
                    f.decreaseHealth();
                } else if (action.equals("plow")) {
                    f.plow();
                } else if (action.equals("harvest")) {
                    f.harvest();
                } else {
                    System.out.println("Your action is not valid!");
                }
            }while(enemyHealth != 0);
                    System.out.println();
                    System.out.println("YOU WON! YOU ARE NOW THE RULER " +
                            "OF THE WORLD!!");
            }
            //RUN CONSTABLE METHODS
            else if(player.equals("constable")){
                do {
                    System.out.println();
                    System.out.println("Please Enter Your Action: ");
                    System.out.println("Run, Attack, Heal, Decrease Stamina, " +
                            "Increase Stamina, Decrease Health, Arrest");
                    String action = scanner.nextLine();
                    if (action.equals("run")) {
                        c.run();
                    } else if (action.equals("attack")) {
                        c.attack();
                        enemyHealth -= 25;
                        System.out.println("Your enemy health is " + enemyHealth + ".");
                    } else if (action.equals("heal")) {
                        c.heal();
                    } else if (action.equals("decrease stamina")) {
                        c.decreaseStamina();
                    } else if (action.equals("increase stamina")) {
                        c.increaseStamina();
                    } else if (action.equals("decrease health")) {
                        c.decreaseHealth();
                    } else if (action.equals("arrest")) {
                        c.arrest();
                    }
                    else {
                        System.out.println("Your action is not valid!");
                    }
                }while(enemyHealth != 0);
                System.out.println();
                System.out.println("YOU WON! YOU ARE NOW THE RULER " +
                        "OF THE WORLD!!");
            }
            //RUN WARRIOR METHODS
            else if(player.equals("warrior")){
                do {
                    System.out.println();
                    System.out.println("Please Enter Your Action: ");
                    System.out.println("Run, Attack, Heal, Decrease Stamina, " +
                            "Increase Stamina, Decrease Health, Decrease Shield Strength");
                    String action = scanner.nextLine();
                    if (action.equals("run")) {
                        c.run();
                    } else if (action.equals("attack")) {
                        w.attack();
                        enemyHealth -= 25;
                        System.out.println("Your enemy health is " + enemyHealth + ".");
                    } else if (action.equals("heal")) {
                        w.heal();
                    } else if (action.equals("decrease stamina")) {
                        w.decreaseStamina();
                    } else if (action.equals("increase stamina")) {
                        w.increaseStamina();
                    } else if (action.equals("decrease health")) {
                        w.decreaseHealth();
                    } else if (action.equals("decrease shield strength")) {
                        w.decreaseShieldStrength();
                    }
                    else {
                        System.out.println("Your action is not valid!");
                    }
                }while(enemyHealth != 0);
                System.out.println();
                System.out.println("YOU WON! YOU ARE NOW THE RULER " +
                        "OF THE WORLD!!");
            }

        }


    }

