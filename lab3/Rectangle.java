public class Rectangle extends MyShape {
    private int xTopLeftCoordinate;
    private int yTopLeftCoordinate;
    private int xBottomRightCoordinate;
    private int yBottomRightCoordinate;

    // Default constructor
    public Rectangle() {
        this(0, 0, 1, -1);
    }

    // Parameterized constructor
    public Rectangle(int xTopLeftCoordinate, int yTopLeftCoordinate, int xBottomRightCoordinate, int yBottomRightCoordinate) {
        this.xTopLeftCoordinate = xTopLeftCoordinate;
        this.yTopLeftCoordinate = yTopLeftCoordinate;
        this.xBottomRightCoordinate = xBottomRightCoordinate;
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }

    // Parameterized constructor with color and filled
    public Rectangle(int xTopLeftCoordinate, int yTopLeftCoordinate, int xBottomRightCoordinate, int yBottomRightCoordinate, String color, boolean filled) {
        super(color, filled);
        this.xTopLeftCoordinate = xTopLeftCoordinate;
        this.yTopLeftCoordinate = yTopLeftCoordinate;
        this.xBottomRightCoordinate = xBottomRightCoordinate;
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }

    public int getXTopLeftCoordinate() {
        return xTopLeftCoordinate;
    }

    public int getYTopLeftCoordinate() {
        return yTopLeftCoordinate;
    }

    public int getLength() {
        return xBottomRightCoordinate - xTopLeftCoordinate;
    }

    public int getWidth() {
        return yTopLeftCoordinate - yBottomRightCoordinate;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "topLeft=(" + xTopLeftCoordinate + ", " + yTopLeftCoordinate + "), bottomRight=(" + xBottomRightCoordinate + ", " + yBottomRightCoordinate + ")} which is subclass of " + super.toString();
    }
}