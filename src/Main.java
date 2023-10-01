import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task6();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        System.out.println(3 <= x && x <= 8);
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        System.out.println((-3 <= x && x <= 5) || (9 <= x && x <= 15));
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        System.out.println(!((-2 <= x && x <= 3) || (6 <= x && x <= 9)));
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((x > 99 && x < 1000) && (x % 5 == 0));
    }

    public static void task5() {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        System.out.println((x1 == x2 * -1 || x1 == x3 * -1 || x1 == x4 * -1 || x1 == 0) || (x2 == x3 * -1 || x2 == x4 * -1 || x2 == 0) || (x3 == x4 * -1 || x3 == 0));
    }

    public static void task6() {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        System.out.println((x1 % 2 == 0 && x2 % 2 == 0) || (x1 % 2 == 0 && x3 % 2 == 0) || (x2 % 2 == 0 && x3 % 2 == 0));
    }
}