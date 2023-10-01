import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 0 && x < 10) {
            System.out.println("DIGIT");
        }
        if (x > 9 && x < 100) {
            System.out.println("NUM");
        }
        if (x < 0 || x > 99) {
            System.out.println("OTHER");
        }
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.print(a + " ");
            if (b < c) {
                System.out.print(b + " ");
                System.out.print(c);
            } else {
                System.out.print(c + " ");
                System.out.print(b);
            }
        }
        if (b < a && b < c) {
            System.out.print(b + " ");
            if (a < c) {
                System.out.print(a + " ");
                System.out.print(c);
            } else {
                System.out.print(c + " ");
                System.out.print(a);
            }
        }
        if (c < a && c < b) {
            System.out.print(c + " ");
            if (a < b) {
                System.out.print(a + " ");
                System.out.print(b);
            } else {
                System.out.print(b + " ");
                System.out.print(a);
            }
        }
    }
    public static void task3() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(x+" TORT");

        if (x % 100 >= 5 && x % 100 <= 20){
            System.out.print("OV");
        }
        else if (x % 10 >= 2 && x % 10 <= 4) System.out.print("A");
        else if (x % 10 >= 5 || x % 10 == 0) System.out.print("OV");
        else if (x % 10 == 1) System.out.print("");
    }
}