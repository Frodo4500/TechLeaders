public class Unit {
    private String unitName = "Unit";
    private int health = 100;
    private int force = 10;
    public void createUnit(String UnitName, int Health, int Force){
        this.unitName = UnitName;
        inputControll(Health, Force);
    }

    private void inputControll(int Health, int Force){
        if(Health > 1 && Health < 101){ this.health = Health; }
        if(Force > 1 && Force < 35){ this.force = Force; }
    }

    public String getName(){ return unitName; }
    public int getHealth(){ return health; }
    public int getForce(){ return force; }

    public int setHealth(int newHealth){
        this.health = newHealth;
        return health;
    }
}