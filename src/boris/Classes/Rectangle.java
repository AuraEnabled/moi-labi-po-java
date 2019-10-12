package boris.Classes;

public class Rectangle {

    private double a_side;
    private double b_side;
    private final int SAMEEDGES = 2;

    public Rectangle(double a_side, double b_side) {
        this.a_side = a_side;
        this.b_side = b_side;
    }

//  диагональ
    public double Diagonal(){ return Math.sqrt(Math.pow(a_side, 2) + Math.pow(b_side, 2)); }

//  периметр
    public double Perimeter(){ return a_side * 2 + b_side * 2; }

//  площадь
    public double Area(){ return a_side * b_side; }

//вывод на  э к р а н
    public void Outputting(){
        System.out.println("\n<>Rectangle<>\nDiagonal is " + Diagonal() + "\nPerimeter is " + Perimeter() + "\nArea is " + Area());
    }
}
