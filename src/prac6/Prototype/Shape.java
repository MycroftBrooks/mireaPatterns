package prac6.Prototype;

public abstract class Shape {
    private int x;
    private int y;

    public Shape() {

    }

    public Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public abstract Shape clone();
}
