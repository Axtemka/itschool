import java.util.Locale;
import java.util.Scanner;

class Time {
    int hour, min, sec;

//    public Time(int min){
//        this.hour = min / 60;
//        this.min = min / 60;
//    }
    public Time(int sec){
        hour = sec / 3600;
        sec = sec % 3600;
        min = sec / 60;
        this.sec = sec % 60;
    }
    public String toString(){
        return hour + ":" + min + ":" + sec;
    }

}


class Vector2D {
    public double x;
    public double y;

    static int count = 0;

    public Vector2D(){
        x = 1;
        y = 1;
        count++;
    }

    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
        count++;
    }

    public Vector2D(Vector2D v){
        this.x = v.x;
        this.y = v.y;
        count++;
    }

    public void print(){
        System.out.println("("+String.format(Locale.US, "%.2f", x)+", "+ String.format(Locale.US, "%.2f", y) +")");
    }

    public double length(){
        return Math.sqrt(x*x + y*y);
    }

    public void add(Vector2D v){
        this.x += v.x;
        this.y += v.y;
    }
    public void sub(Vector2D v){
        this.x -= v.x;
        this.y -= v.y;
    }

    public void scale(double scaleFactor){
        this.x *= scaleFactor;
        this.y *= scaleFactor;
    }

    public void normalized(){

        if (this.y < 0) this.y = -1.0;
        else this.y = 1.0;

        if (this.x < 0) this.x = -1.0;
        else this.x = 1.0;
    }

    public double dotProduct(Vector2D v){
        return v.x * this.x + v.y * this.y;
    }

}

public class Main {
    static {
        System.out.println("Test");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector2D vA = new Vector2D();
        Vector2D vB = new Vector2D(5.0, 7.0);
        Vector2D vC = new Vector2D(vB);
        vA.add(vB);
        vA.print();
        vA.sub(vC);
        vA.print();
        System.out.println(vB.length());
        vC.scale(1.5);
        vC.print();
        vC.normalized();
        System.out.println(vC.length());
        vC.scale(2);
        System.out.println(vA.dotProduct(vB));
        System.out.println(vA.count);
    }
}
