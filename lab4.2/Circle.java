public class Circle extends MyShape {
    private int xCoordinate;
    private int yCoordinate;
    private int radius;

    public Circle() {
        this(0, 0, 1);
    }
    public Circle(int xCoordinate, int yCoordinate, int radius) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
    }

    public Circle(int xCoordinate, int yCoordinate, int radius, String color, boolean filled) {
        super(color, filled);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return xCoordinate == circle.xCoordinate && yCoordinate == circle.yCoordinate && radius == circle.radius;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + xCoordinate;
        result = 31 * result + yCoordinate;
        result = 31 * result + radius;
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" + "x=" + xCoordinate + ", y=" + yCoordinate + ", radius=" + radius + "} which is subclass of " + super.toString();
    }
}
