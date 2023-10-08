import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        task7();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for(int i = 0; i < n; i++){
            data[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for(int i = 0; i < n; i++){
            if (data[i] == x) {
                System.out.println(i+1);
                break;
            }
            if (i == n-1 && data[i] != x) System.out.println("NO");
        }
    }
    public static void task2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            data[i] = sc.nextInt();
        }
        boolean flag = true;
        for(int i = 0; i < n; i++){
            if (data[i] % 2 == 0) {
                sum+= data[i];
                flag = false;
            }
        }
        if (flag) System.out.println("NO");
        else System.out.println(sum);
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        float avg = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            data[i] = sc.nextInt();
        }
        boolean flag = true;
        for(int i = 0; i < n; i++){
            if (data[i] % 2 != 0) {
                avg+= data[i];
                count++;
                flag = false;
            }
        }
        if (flag) System.out.println("NO");
        else {
            DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
            String result = decimalFormat.format(avg / count);
            System.out.print(result);
        }
    }
    public static void task4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        int a1 = 4;
        for(int i = 0;i < n; i++){
            data[i] = a1;
            a1 += 3;
        }
        for(int i = 0;i < n; i++){
            System.out.print(data[i] + " ");
        }
    }
    public static void task5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for(int i = 0; i < n; i++){
            data[i] = sc.nextInt();
        }

        for(int i = 0; i < n/2; i++){
            int tmp = data[i];
            data[i] = data[n-1-i];
            data[n-1-i] = tmp;
        }

        for(int i = 0; i < n; i++){
            System.out.print(data[i] + " ");
        }
    }
    public static void task6() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] data = new int[2][n];
        for(int i = 0; i < n; i++){
            data[0][i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (data[0][i] == data[0][j]){
                    data[1][i]++;
                }
            }
        }
        int maxi = 0;
        for(int i = 0; i < n; i++){
            if (data[1][i] > data[1][maxi]) maxi = i;
        }
        System.out.println(data[0][maxi]);
    }
    public static void task7() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];

        for(int i = 0; i < n; i++){
            data[i] = sc.nextInt();
        }

        int[] tmp = new int[n];
        int ind = 0;
        for(int i = 0; i < n; i++){
            if (data[i] < 0){
                tmp[ind] = data[i];
                ind++;
            }
        }
        for(int i = 0; i < n; i++){
            if (data[i] >= 0){
                tmp[ind] = data[i];
                ind++;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(tmp[i] + " ");
        }

    }
}
