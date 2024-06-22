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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Square square = (Square) obj;
        return getXTopLeftCoordinate() == square.getXTopLeftCoordinate() &&
                getYTopLeftCoordinate() == square.getYTopLeftCoordinate() &&
                getSideLength() == square.getSideLength();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Square{" + "topLeft=(" + getXTopLeftCoordinate() + ", " + getYTopLeftCoordinate() + "), sideLength=" + getSideLength() + "} which is subclass of " + super.toString();
    }
}
