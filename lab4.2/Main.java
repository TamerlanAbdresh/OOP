import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 5, "red", true);
        Circle circle2 = new Circle(0, 0, 5, "red", true);
        Rectangle rectangle1 = new Rectangle(0, 10, 10, 0, "blue", false);
        Square square1 = new Square(5, 5, 5, "green", true);

        Map<MyShape, String> shapeMap = new HashMap<>();
        shapeMap.put(circle1, "CIRCLE");
        shapeMap.put(rectangle1, "RECTANGLE");
        shapeMap.put(square1, "SQUARE");

        System.out.println("Number of elements in the map: " + shapeMap.size());
        System.out.println("Value by key circle1: " + shapeMap.get(circle1));

    }
}