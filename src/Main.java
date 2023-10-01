import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.sin;

public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        if (x * x + y * y >= 4 && x <= 2 && y >= 0 && y < x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        if (y <= sin(x) && y >= 0 && y <= 0.5 && x >= 0 && x < PI) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        if (((y <= 2 - x * x) && (x <= 0 && y >= x))   ||  ((y <= 2 - x * x) && (x >= 0) && y >= 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}