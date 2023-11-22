package Units;

public class Mage extends Unit {
    private int mana;
    public Mage(String name, int hp, int mana) {
        super(name, hp);
        setMana(mana);
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    @Override
    public void getDmg(int dmg){
        if (mana >= 2 && dmg != 0){
            mana-=2;
            health-=dmg/3;
            System.out.println(getName()+" <===# МАГИЧЕСКАЯ ЗАЩИТА! " + getName() + " получает урон в размере " + dmg/3 + " единиц");
        }
        else {
            health-=dmg;
            System.out.println(getName() + " <===# получает урон в размере " + dmg + " единиц");
        }
        printInfo();
    }
    @Override
    public void doDmg(Unit unit) {
        if (mana >= 5){
            mana-=5;
            System.out.println(getName()+" #===> ПОПАДАНИЕ: Мощным заклинанием нанесено " + 25 + " единиц урона персонажу " + unit.getName());
            unit.getDmg(25);
        }
        else{
            System.out.println(getName()+" #===> ПОПАДАНИЕ: Ударом посоха нанесено " + 5 + " единиц урона персонажу " + unit.getName());
            unit.getDmg(5);
        }

    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mana: "+getMana());
        System.out.println("==========================");
        System.out.println();
    }
}