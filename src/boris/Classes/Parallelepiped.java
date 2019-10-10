package boris.Classes;
import boris.Classes.Figure;

public class Parallelepiped extends Figure {

    private double side_a;
    private double side_b;
    private double side_c;
    public final int SIMILAR_EDGES = 2;



    public Parallelepiped(double side_a, double side_b, double side_c) {
        super(side_a, side_b, side_c);
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

//    Площадь   (Я метод перегрузил, кста)
    public double Area(double side_a, double side_b, double side_c, int SIMILAR_EDGES){ return (side_a * side_b + side_b * side_c + side_c * side_a) * SIMILAR_EDGES; }

//    Объем
    public double Volume(double side_a, double side_b, double side_c){
        return side_a * side_b * side_c;
    }
}
