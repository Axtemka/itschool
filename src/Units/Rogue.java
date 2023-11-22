package Units;

public class Rogue extends Unit {
    private int agility;
    public Rogue(String name, int hp, int agility) {
        super(name, hp);
        setAgility(agility);
    }
    public int getAgility() {
        return agility;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }
    @Override
    public void getDmg(int dmg){
        int chance = (int)(Math.random() * 20) + 1 + agility;
        if (chance <= 15){
            health -= dmg;
            System.out.println(getName() + " <===# получает урон в размере " + dmg + " единиц");
        }
        else{
            System.out.println(getName() + " <===# УВЕРНУЛСЯ! "+ getName() + " не получил урона");
        }
        printInfo();
    }
    @Override
    public void doDmg(Unit unit) {
        int chance = (int)(Math.random() * 20) + 1 + agility;
        if (chance > 16) {
            System.out.println(getName()+" #===> КРИТИЧЕСКОЕ ПОПАДАНИЕ! Нанесено " + chance+ " единиц урона персонажу " + unit.getName());
            unit.getDmg(chance);
        }
        else if (chance >= 10) {
            System.out.println(getName()+" #===> ПОПАДАНИЕ: Нанесено " + 10 + " единиц урона персонажу " + unit.getName());
            unit.getDmg(10);
        }
        else {
            System.out.println(getName()+" #===> ПРОМАХ!: " + unit.getName() + " не получает урона");
            unit.getDmg(0);
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Agility: "+getAgility());
        System.out.println("==========================");
        System.out.println();
    }
}
