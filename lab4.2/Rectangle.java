public class Rectangle extends MyShape {
    private int xTopLeftCoordinate;
    private int yTopLeftCoordinate;
    private int xBottomRightCoordinate;
    private int yBottomRightCoordinate;

    public Rectangle() {
        this(0, 0, 1, -1);
    }

    public Rectangle(int xTopLeftCoordinate, int yTopLeftCoordinate, int xBottomRightCoordinate, int yBottomRightCoordinate) {
        this.xTopLeftCoordinate = xTopLeftCoordinate;
        this.yTopLeftCoordinate = yTopLeftCoordinate;
        this.xBottomRightCoordinate = xBottomRightCoordinate;
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }

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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return xTopLeftCoordinate == rectangle.xTopLeftCoordinate && yTopLeftCoordinate == rectangle.yTopLeftCoordinate &&
                xBottomRightCoordinate == rectangle.xBottomRightCoordinate && yBottomRightCoordinate == rectangle.yBottomRightCoordinate;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + xTopLeftCoordinate;
        result = 31 * result + yTopLeftCoordinate;
        result = 31 * result + xBottomRightCoordinate;
        result = 31 * result + yBottomRightCoordinate;
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "topLeft=(" + xTopLeftCoordinate + ", " + yTopLeftCoordinate + "), bottomRight=(" + xBottomRightCoordinate + ", " + yBottomRightCoordinate + ")} which is subclass of " + super.toString();
    }
}
