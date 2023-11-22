package Units;

public abstract class Unit implements Fight {
    private String name;
    protected int health;
    public Unit(String name, int hp) {
        setName(name);
        setHealth(hp);
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return Math.max(health, 0);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = Math.max(health, 0);
    }

    public boolean deathCheck(){
        if (getHealth() == 0){
            deathMessage();
            return true;
        }
        return false;
    }
    public void deathMessage(){
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("Персонаж " + getName() + " погиб...");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
    }
    public void printInfo(){
        System.out.println();
        System.out.println("==========================");
        System.out.println("Name: "+getName()+"\nHealth: " + getHealth());
    }
}