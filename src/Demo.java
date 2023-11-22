import Units.Mage;
import Units.Rogue;
import Units.Unit;
import Units.Warrior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public void demo(){
        Scanner sc = new Scanner(System.in);

        Mage mage = new Mage("Lait", 75, 40);
        Rogue rogue = new Rogue("Krill", 100, 5);
        Warrior warrior = new Warrior("Anunah", 150, 7);
        
        Unit winner = null;

        ArrayList<Unit> units = new ArrayList<Unit>();
        units.add(rogue);
        units.add(mage);
        units.add(warrior);

        int round_count = 1;
        while(mage.getHealth() > 0 || rogue.getHealth() > 0 || warrior.getHealth() > 0){
            System.out.println("========Р=А=У=Н=Д="+round_count+"========");
            for (Unit unit: units) {
                if (unit.getHealth() > 0){
                    if (unit instanceof Mage){
                        String enter;
                        if (units.contains(warrior) && warrior.getHealth() > 0){
                            System.out.println();
                            System.out.println("-------======="+unit.getClass().getName() + " " + unit.getName() + " атакует " + warrior.getClass().getName() + " " + warrior.getName()+"=======-------");
                            System.out.println();
                            System.out.println("=====Б=О=Й=====");
                            mage.doDmg(warrior);
                            System.out.println("===К=О=Н=Е=Ц=Б=О=Я===");
                            warrior.deathCheck();
                            enter = sc.nextLine();
                        }
                        if (units.contains(rogue) && rogue.getHealth() > 0){
                            System.out.println();
                            System.out.println("-------======="+unit.getClass().getName() + " " + unit.getName() + " атакует " + rogue.getClass().getName() + " " + rogue.getName()+"=======-------");
                            System.out.println();
                            System.out.println("=====Б=О=Й=====");
                            mage.doDmg(rogue);
                            System.out.println("===К=О=Н=Е=Ц=Б=О=Я===");
                            rogue.deathCheck();
                            enter = sc.nextLine();
                        }
                        continue;
                    }
                    if (unit instanceof Rogue){
                        String enter;
                        if (units.contains(warrior) && warrior.getHealth() > 0){
                            System.out.println();
                            System.out.println("-------=======" + unit.getClass().getName() + " " + unit.getName() + " атакует " + warrior.getClass().getName() + " " + warrior.getName()+"=======-------");
                            System.out.println();
                            System.out.println("=====Б=О=Й=====");
                            rogue.doDmg(warrior);
                            System.out.println("===К=О=Н=Е=Ц=Б=О=Я===");
                            warrior.deathCheck();
                            enter = sc.nextLine();
                        }
                        if (units.contains(mage) && mage.getHealth() > 0){
                            System.out.println();
                            System.out.println("-------======="+unit.getClass().getName() + " " + unit.getName() + " атакует " + mage.getClass().getName() + " " + mage.getName()+"=======-------");
                            System.out.println();
                            System.out.println("=====Б=О=Й=====");
                            rogue.doDmg(mage);
                            System.out.println("===К=О=Н=Е=Ц=Б=О=Я===");
                            mage.deathCheck();
                            enter = sc.nextLine();
                        }

                        continue;
                    }
                    if (unit instanceof Warrior){
                        String enter;
                        if (units.contains(mage) && mage.getHealth() > 0){
                            System.out.println();
                            System.out.println("-------======="+unit.getClass().getName() + " " + unit.getName() + " атакует " + mage.getClass().getName() + " " + mage.getName()+"=======-------");
                            System.out.println();
                            System.out.println("=====Б=О=Й=====");
                            warrior.doDmg(mage);
                            System.out.println("===К=О=Н=Е=Ц=Б=О=Я===");
                            mage.deathCheck();
                            enter = sc.nextLine();
                        }
                        if (units.contains(rogue) && rogue.getHealth() > 0){
                            System.out.println();
                            System.out.println("-------======="+unit.getClass().getName() + " " + unit.getName() + " атакует " + rogue.getClass().getName() + " " + rogue.getName()+"=======-------");
                            System.out.println();
                            System.out.println("=====Б=О=Й=====");
                            warrior.doDmg(rogue);
                            System.out.println("===К=О=Н=Е=Ц=Б=О=Я===");
                            rogue.deathCheck();
                            enter = sc.nextLine();
                        }
                    }
                }
            }
            round_count++;
            int win_check = 0;
            if (warrior.getHealth() == 0) win_check++;
            if (mage.getHealth() == 0) win_check++;
            if (rogue.getHealth() == 0) win_check++;
            if (win_check == 2){
                if (warrior.getHealth() != 0) winner = warrior;
                if (mage.getHealth() != 0) winner = mage;
                if (rogue.getHealth() != 0) winner = rogue;
                break;
            }
        }
        System.out.println("ПОБЕДИТЕЛЬ: ");
        winner.printInfo();
    }
}
