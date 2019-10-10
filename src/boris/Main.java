package boris;

import boris.Classes.Figure;
import boris.Classes.Figures;
import boris.Classes.Parallelepiped;


public class Main {

//      Начальные параметры
    private static double side_a =2.0d;
    private static double side_b =5.0d;
    private static double side_c =4.0d;

    public static void main(String[] args) {

//      Определение фигуры
        if(side_c != 0){
            Parallelepiped parallelepiped = new Parallelepiped(side_a, side_b, side_c);
        }else{
            Figure Rectangle = new Figure(side_a, side_b, 0);
        }


    }


}
