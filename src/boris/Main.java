package boris;
import boris.Classes.Parallelepiped;
import boris.Classes.Parallelepipeds;
import boris.Classes.Rectangle;
import boris.Classes.Rectangles;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    private static double a_side;
    private static double b_side;
    private static double c_side;


    public static void main(String[] args) {
        out.println("Set \"a\" length");
        Scanner aInner = new Scanner(in);
        out.println("Set \"b\" length");
        Scanner bInner = new Scanner(in);
        out.println("Set \"с\" length");
        Scanner cInner = new Scanner(in);

        a_side = aInner.nextDouble();
        b_side = bInner.nextDouble();
        c_side = cInner.nextDouble();

        if(c_side < 1e-6) {
            Rectangle rectangle = new Rectangle(a_side, b_side);
            out.println(rectangle);
        }else {
            Parallelepiped parallelepiped = new Parallelepiped(a_side, b_side, c_side);
            out.println(parallelepiped);
        }

//
        Rectangles.rectangleCreation();
        Rectangles.Outputting();
        Parallelepipeds.Outputting();
    }


}
