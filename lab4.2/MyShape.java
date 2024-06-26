public class MyShape {
    private String color;
    private boolean filled;


    public MyShape() {
        this.color = "red";
        this.filled = true;
    }
    public MyShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyShape myShape = (MyShape) obj;
        return filled == myShape.filled && color.equals(myShape.color);
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + (filled ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MyShape{" + "color=" + color + ", isFilled=" + filled + "}";
    }
}
