package boris.Classes;

import lombok.Getter;
import lombok.Setter;
import java.lang.Math;

public class Figure {

    private double side_a;
    private double side_b;

    //Character.isDigit((char) side_a)  input.matches("[^0-9]")

    public void setSide_a(double side_a){

    }


public Figure(double side_a, double side_b){

    this.side_a = side_a;
    this.side_b = side_b;

}
public static double Area(double side_a, double side_b){
        return side_a * side_b;
}

public static double Diagonel(double side_a, double side_b){
        return Math.sqrt(Math.pow(side_a, 2)+Math.pow(side_b,2));
}

public  static double Perimether(double side_a, double side_b){
        return side_a * 2 + side_b * 2;
}

//
}
