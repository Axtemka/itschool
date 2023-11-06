class Unit{
    private String name;
    private int health;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void printInfo(){
        System.out.println("Name: "+getName()+"\nHealth: " + getHealth());
    }
    public Unit(String name){
        setName(name);
        setHealth(100);
    }
    public Unit(Unit unit){
        setName(unit.getName());
        setHealth(unit.getHealth());
    }
}

class Mage extends Unit{
    private int mana;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Mage(String name) {
        super(name);
        setMana(20);
    }

    public Mage(Mage mage){
        super(mage);
        setMana(mage.getMana());

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mana: "+getMana());
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("//Создание обьекта Unit");
        Unit unit = new Unit("Axtemka");
        unit.printInfo();
        System.out.println();
        System.out.println("//Создание обьекта Mage");
        Mage mage = new Mage("Wizz");
        mage.printInfo();
        System.out.println();
        System.out.println("//Создание еще одного обьекта Mage");
        Mage mage2 = new Mage("ab");
        mage2.printInfo();
        System.out.println();
        System.out.println("//Копирование unit");
        Unit newu = new Unit(unit);
        newu.printInfo();
        System.out.println();
        System.out.println("//Копирование mage");
        Mage mage3 = new Mage(mage);
        mage3.printInfo();
    }
}
