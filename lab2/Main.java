import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();
        Circle myCircle = new Circle(x,y,r);
        System.out.println(myCircle);
        myCircle.getArea();
        System.out.println(myCircle.getArea());;
    }
}