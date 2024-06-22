public class Square extends Rectangle {
    public Square() {
        this(0, 0, 1);
    }

    public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength) {
        super(xTopLeftCoordinate, yTopLeftCoordinate, xTopLeftCoordinate + sideLength, yTopLeftCoordinate - sideLength);
    }

    public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength, String color, boolean filled) {
        super(xTopLeftCoordinate, yTopLeftCoordinate, xTopLeftCoordinate + sideLength, yTopLeftCoordinate - sideLength, color, filled);
    }

    public int getSideLength() {
        return getLength();
    }

    @Override
    public String toString() {
        return "Square{" + "topLeft=(" + getXTopLeftCoordinate() + ", " + getYTopLeftCoordinate() + "), sideLength=" + getSideLength() + "} which is subclass of " + super.toString();
    }
}