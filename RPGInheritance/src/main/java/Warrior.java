public class Warrior extends Base{
    //INITIALIZE VARIABLES
    int strength = 75;
    int health = 100;
    int stamina = 100;
    int speed = 50;
    int attackPower = 10;
    private int shieldStrength = 100;

    //METHODS
    public void run(){
        speed +=25;
        System.out.println("Your speed is now "+speed+ "!");
    }
    public void attack(){
        strength -= 10;
        attackPower += 10;
        System.out.println("You have attacked your opponent!");
        System.out.println("Your strength is now "+ strength + "!");
    }
    public void heal(){
        health += 20;
        System.out.println("Your health has increased, it is now "+ health + "!");
    }
    public void decreaseHealth(){
        health -= 25;
        System.out.println("Your health is now "+ health + "!");
    }
    public void increaseStamina(){
        stamina += 10;
        System.out.println("Your stamina is now "+ stamina + "!");
    }
    public void decreaseStamina(){
        stamina -= 10;
        System.out.println("Your stamina is now "+ stamina + "!");
    }

    public void decreaseShieldStrength(){
        shieldStrength -= 25;
        System.out.println("Your Shield Strength is now "+ shieldStrength + "!");

    }
}
