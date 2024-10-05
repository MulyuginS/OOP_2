package shapes;
import colors.Color;


public class Circle extends Shape {
    private Point point;
    private double radius;


    public Point getPoint() {
        return point;
    }
    public void setPoint(Point point) {
        this.point = point;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
        validate();
    }

    private void validate() {
        if (radius <= 0) {
            throw new IllegalArgumentException("Не удалось создать фигуру. Радиус не может быть меньше или равен нулю.");
        }
    }

    public Circle() {
    }
    public Circle(Point point, double radius, Color color) {
        this.point = point;
        this.radius = radius;
        this.setColor(color);
        validate();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI  * radius;
    }
    @Override
    public void move(double moveX, double moveY) {
        point.setX(point.getX() + moveX);
        point.setY(point.getY() + moveY);
    }
    @Override
    public void draw() {
        System.out.println("Фигура: Круг" );
        System.out.println("Цeнтр: " + this.point.getX() + " " +  this.point.getY());
        System.out.println("Радиус: " + this.radius);
        System.out.println("Периметр: " + this.getPerimeter());
        System.out.println("Площадь: " + this.getArea());
        System.out.println("Цвет: " + getColor());
    }

}
