package boris.Classes;
import boris.Classes.Figure;

public class Parallelepiped extends Figure {

    private double side_a;
    private double side_b;
    private double side_c;
    public final int SIMILAR_EDGES = 2;



    public Parallelepiped(double side_a, double side_b, double side_a1, double side_b1, double side_c) {
        super(side_a, side_b);
        this.side_a = side_a1;
        this.side_b = side_b1;
        this.side_c = side_c;
    }

    public double Area(double side_a, double side_b, double side_c, int SIMILAR_EDGES){
        return (side_a * side_b + side_b * side_c + side_c * side_a) * SIMILAR_EDGES;
    }

    public double Volume(double side_a, double side_b, double side_c){
        return side_a * side_b * side_c;
    }

}
