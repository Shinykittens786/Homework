import java.util.*;
class Main {
    public static void main (String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add (new RightAngledTriange(4.0, 3.0)); // Hypotenuse should be 5.
        shapes.add(new Parallelogram(4.0, 3.0, 40)); 
        shapes.add(new EquilateralTriangle(3.0, 3.0));
        shapes.add(new Circle(5.0)); 
        shapes.add(new Square(3.0, 3.0)); 
        shapes.add(new Rectangle(3.0, 6.0)); 
    //public double getArea(); 
    /*public double getPerimeter(); 
    public int getNumOfEdges(); 
    public int getNumOfCorners(); */
        for (Shape shape: shapes) {
            System.out.println(shape.getArea()); 
            System.out.println(shape.getPerimeter()); 
            System.out.println(shape.getNumOfEdges()); 
            System.out.println(shape.getNumOfCorners());
        }
    }//main
}//Main