package Units;

public class Warrior extends Unit{
    private int armor;
    public Warrior(String name, int hp, int armor) {
        super(name, hp);
        setArmor(armor);
    }
    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
    @Override
    public void getDmg(int dmg){
        if (armor > 0 && dmg != 0){
            armor -= 1;
            health -= dmg/2;
            System.out.println(getName() + " <===# КРЕПКИЕ ДОСПЕХИ! " + getName() + " получает урон в размере " + dmg/2 + " единиц");
        }else{
            health -= dmg;
            System.out.println(getName() + " <===# получает урон в размере " + dmg + " единиц");
        }
        printInfo();
    }

    @Override
    public void doDmg(Unit unit) {
        System.out.println(getName()+" #===> ПОПАДАНИЕ: Нанесено " + 15 + " единиц урона персонажу " + unit.getName());
        unit.getDmg(15);

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Armor: "+getArmor());
        System.out.println("==========================");
        System.out.println();
    }
}
