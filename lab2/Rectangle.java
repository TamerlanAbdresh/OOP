public class Rectangle {
    private int x1, y1; // Верхняя левая точка
    private int x2, y2; // Нижняя правая точка

    // Конструктор
    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Геттеры и сеттеры
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    // Метод для расчета площади
    public double getArea() {
        return Math.abs((x2 - x1) * (y2 - y1));
    }

    // Метод для расчета периметра
    public double getPerimeter() {
        return 2 * (Math.abs(x2 - x1) + Math.abs(y2 - y1));
    }

    // Метод для расчета расстояния до центра другого прямоугольника
    public double getDistanceToTheCenterOf(Rectangle anotherRectangle) {
        double xCenter1 = (x1 + x2) / 2.0;
        double yCenter1 = (y1 + y2) / 2.0;
        double xCenter2 = (anotherRectangle.x1 + anotherRectangle.x2) / 2.0;
        double yCenter2 = (anotherRectangle.y1 + anotherRectangle.y2) / 2.0;
        return Math.sqrt(Math.pow(xCenter1 - xCenter2, 2) + Math.pow(yCenter1 - yCenter2, 2));
    }

    @Override
    public String toString() {
        return "Rectangle[(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")]";
    }
}