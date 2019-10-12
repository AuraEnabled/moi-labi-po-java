package boris;
import boris.Classes.Parallelepiped;
import boris.Classes.Rectangle;

import java.util.Scanner;

public class Main {

    private static double a_side;
    private static double b_side;
    private static double c_side;


    public static void main(String[] args) {
        System.out.println("Set \"a\" length");
        Scanner aInner = new Scanner(System.in);
        System.out.println("Set \"b\" length");
        Scanner bInner = new Scanner(System.in);
        System.out.println("Set \"с\" length");
        Scanner cInner = new Scanner(System.in);

        a_side = aInner.nextDouble();
        b_side = bInner.nextDouble();
        c_side = cInner.nextDouble();

        if(c_side < 1e-6) {
            Rectangle rectangle = new Rectangle(a_side, b_side);
            rectangle.Outputting();
        }else {
            Parallelepiped parallelepiped = new Parallelepiped(a_side, b_side, c_side);
            parallelepiped.Outputting();
        }

    }


}
