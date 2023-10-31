class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "(" + name + ", " + age + ")";
    }
    public String work(){
        return "None";
    }

}

class Employee extends Person{

    private String company;

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    @Override
    public String toString() {
        return "(" + super.getName() + ", " + super.getAge() + ", " + company + ")";
    }

    @Override
    public String work() {
        return "Manager";
    }
}

//===========================================================


interface Moveable{
    void move(float dx, float dy);
    void resize(float koeff);
}


class Figure{
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public Figure(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

}

class Rectangle extends Figure implements Moveable{
    private float height;
    private float width;

    public Rectangle(double x, double y, float height, float width){
        super(x, y);
        setHeight(height);
        setWidth(width);
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2*(height + width);
    }

    @Override
    public void move(float dx, float dy) {
        super.setX(super.getX() + dx);
        super.setY(super.getY() + dy);
    }

    @Override
    public void resize(float koeff) {
        setWidth(getWidth()*koeff);
        setHeight(getHeight()*koeff);
    }

    public String toString(){
        return "Rectangle\nCenter: ("+(getX()+getWidth()/2)+", "+(getY()+getHeight()/2)+")\nHeight: "+getHeight()+"\nWidth: "+getWidth();
    }
}

class Circle extends Figure implements Moveable{
    private float radius;

    public Circle(double x, double y, float radius) {
        super(x, y);
        setRadius(radius);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius*radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public void move(float dx, float dy) {
        super.setX(super.getX()+dx);
        super.setY(super.getY()+dy);
    }


    @Override
    public void resize(float koeff) {
        setRadius(getRadius()*koeff);
    }

    public String toString(){
        return "Circle\nCenter: ("+getX()+", "+getY()+")\nRadius: "+getRadius();
    }
}

//==============================================================================

abstract class Animal {
    public abstract String speak();
}
class Cat extends Animal{
    @Override
    public String speak() {
        return "Meow";
    }
}

//interface Animal{
//    public String speak();
//}
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 1);
        Rectangle rectangle = new Rectangle(10, 10, 1, 1);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
    }
}
