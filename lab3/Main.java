import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter xTopLeftCoordinate:");
        int xTopLeftCoordinate = scanner.nextInt();
        System.out.println("Enter yTopLeftCoordinate:");
        int yTopLeftCoordinate = scanner.nextInt();
        System.out.println("Enter sideLength:");
        int sideLength = scanner.nextInt();

        Square square = new Square(xTopLeftCoordinate, yTopLeftCoordinate, sideLength);

        System.out.println("Area: " + square.getLength() * square.getWidth());
        System.out.println("Perimeter: " + (2 * (square.getLength() + square.getWidth())));
        System.out.println("Color: " + square.getColor());
        System.out.println("Filled: " + square.isFilled());

        System.out.println("Enter new color:");
        scanner.nextLine();
        String newColor = scanner.nextLine();
        square.setColor(newColor);

        System.out.println("New Color: " + square.getColor());
    }
}