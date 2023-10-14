import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] data = new int[size];
        for(int i = 0; i < size; i++){
            data[i] = sc.nextInt();
        }
        print_arr(minToBegin(data));
    }
    public static int sumOfDigits(int num){
        int summ = 0;
        while(num > 0){
            summ += num % 10;
            num = num / 10;
        }
        return summ;
    }

    public static int sumOfSeven(int a, int b){
        int summ = 0;
        for(int i = a; i <= b; i++){
            if (i % 7 == 0 && i > 9 && i < 100) summ += i % 10 + i / 10 % 10;
        }
        return summ;
    }

    public static int sumOfThirteen(int num){
        int count = 0;
        for(int i = 0; i < num; i++){
            if (sumOfDigits(i) % 13 == 0) count++;
        }
        return count;
    }

    public static double avgOf4Digit(int[] arr){
        double summ = 0;
        int count = 0;
        for (int j : arr) {
            if (j > 999 && j < 10000) {
                summ += j;
                count++;
            }
        }
        if (count == 0) return -1;
        return summ / count;
    }

    public static int[] minToBegin(int[] data){
        int min = data[data.length-1];
        int mini = data.length-1;
        for(int i = data.length-1; i >= 0; i--){
            if (data[i] <= min) {
                min = data[i];
                mini = i;
            }
        }
        for(int i = mini; i > 0; i--){
            int tmp = data[i-1];
            data[i-1] = data[i];
            data[i] = tmp;
        }
        return data;
    }
    public static void print_arr(int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+" ");
        }
    }

}
