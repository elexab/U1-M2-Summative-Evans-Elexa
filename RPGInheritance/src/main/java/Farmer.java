public class Farmer extends Base{
    //INITIALIZE VARIABLES
    int strength = 75;
    int health = 100;
    int stamina = 75;
    int speed = 10;
    int attackPower = 1;

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

    public void plow(){
        System.out.println("You have used the action plow!");
    }

    public void harvest(){
        System.out.println("You have used the action harvest!");
    }


}
