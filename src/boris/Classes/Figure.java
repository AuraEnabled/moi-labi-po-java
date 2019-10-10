package boris.Classes;
import boris.Classes.Parallelepiped;

import lombok.Getter;
import lombok.Setter;
import java.lang.Math;

public class Figure {

    private double side_a;
    private double side_b;
    private double side_c;


    //Character.isDigit((char) side_a)  input.matches("[^0-9]")

//    public void setSide_a(double side_a){
//
//    }



public Figure(double side_a, double side_b, double side_c){
    this.side_a = side_a;
    this.side_b = side_b;

}

//if(side_c != 0){
//    Parallelepiped parallelepiped = new Parallelepiped(side_a, side_b, side_c);
//    }


//  площадь
public static double Area(double side_a, double side_b){
        return side_a * side_b;
}

//  диагональ
public static double Diagonel(double side_a, double side_b){ return Math.sqrt(Math.pow(side_a, 2)+Math.pow(side_b,2)); }

//  периметр
public  static double Perimether(double side_a, double side_b){
        return side_a * 2 + side_b * 2;
}

//
}
