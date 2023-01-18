package module8;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape trapezium = new Trapezium();
        Shape rectangle = new Rectangle();
      String var = Handler.getShape(circle);
        System.out.println(var);
    }
}
