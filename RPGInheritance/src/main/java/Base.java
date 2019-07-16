public abstract class Base {
    //CREATE VARIABLES
    protected String name;
    protected int strength;
    protected int health;
    protected int stamina;
    protected int speed;
    protected int attackPower;
    protected int shieldStrength;


    //CREATE ABSTRACT METHOD SIGNATURES
    public abstract void run();
    public abstract void attack();
    public abstract void heal();
    public abstract void decreaseHealth();
    public abstract void increaseStamina();
    public abstract void decreaseStamina();


}
