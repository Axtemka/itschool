import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task7();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        while (x >= 0) {
            count++;
            x = sc.nextInt();
        }
        count++;
        System.out.println(count);
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        int x;
        int sm = 0;
        do {
            x = sc.nextInt();
            if (x > 10) sm += x;
        } while (x % 5 != 0);
        System.out.println(sm);
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        while (x > 9 && x < 100) {
            sum += x % 10 + x / 10 % 10;
            x = sc.nextInt();
        }
        System.out.println(sum);
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int del = 0;
        while (a > 0) {
            if (a - b < 0) break;
            a -= b;
            del++;

        }

        System.out.print(del + " " + a);
    }

    public static void task5() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int del = 0;
        boolean flag = true;
        if (a == 0) {
            System.out.println(1);
            flag = false;
        }
        while (a > 0) {
            del++;
            a /= 2;
        }
        if (flag) System.out.print(del);
    }

    public static void task6() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 25) {
            if (n % 2 == 0) count += n;
            n--;
        }
        System.out.println(count);
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        if (n == 0) {
            flag = false;
            System.out.println(1);
        }
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        if (flag) System.out.println(count);
    }
}
