public class AdvancedCircle {
    private Point center;
    private double radius;

    // Конструктор
    public AdvancedCircle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Геттеры и сеттеры
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "AdvancedCircle[center=" + center + ", radius=" + radius + "]";
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getDistanceTo(AdvancedCircle anotherCircle) {
        return this.center.getDistance(anotherCircle.getCenter());
    }
}