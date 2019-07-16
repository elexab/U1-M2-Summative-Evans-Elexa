public class Constable extends Base{
    //INITIALIZE VARIABLES
    int strength = 60;
    int health = 100;
    int stamina = 60;
    int speed = 20;
    int attackPower = 5;
    boolean jurisdiction = false;

    //METHODS
    public void run(){
        speed +=15;
        System.out.println("Your speed is now "+speed+ "!");
    }
    public void attack(){
        strength -= 10;
        attackPower += 5;
        System.out.println("You have attacked your opponent!");
        System.out.println("Your strength is now "+ strength + "!");
    }
    public void heal(){
        health += 20;
        System.out.println("Your health has increased, it is now "+ health + "!");
    }
    public void decreaseHealth(){
        health -=25;
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

    public void arrest(){
        jurisdiction = true;
        System.out.println("You are now in your jurisdiction " +
                "and have made an arrest.");
    }
}
