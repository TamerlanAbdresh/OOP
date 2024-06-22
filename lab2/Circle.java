public class Circle {
    private double xCoordinate;
    private double yCoordinate;
    private double radius;

    public Circle(double xCoordinate, double yCoordinate, double radius) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
    }

    // Getters
    public double getXCoordinate() {
        return xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public double getRadius() {
        return radius;
    }

    // Setters
    public void setXCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "xCoordinate=" + xCoordinate + "," +
                " yCoordinate=" + yCoordinate + ", " +
                "radius=" + radius + "}";
    }

    // Площадь
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // длина окружности
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Что бы найти дистанцию до другой оркужности
    public double getDistanceTo(Circle anotherCircle) {
        double dx = this.xCoordinate - anotherCircle.xCoordinate;
        double dy = this.yCoordinate - anotherCircle.yCoordinate;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
