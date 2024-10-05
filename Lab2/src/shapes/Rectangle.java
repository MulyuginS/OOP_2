package shapes;

import colors.Color;

public class Rectangle extends Shape {
    private Point pointA;
    private Point pointC;


    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
        validate();
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
        validate();
    }

    private void validate() {
        if (pointA.getX() == pointC.getX() || pointA.getY() == pointC.getY()) {
            throw new IllegalArgumentException("Не удалось создать фигуру, т.к. точки x или y лежат на одной прямой");
        }
    }

    public Rectangle() {
    }

    public Rectangle(Point pointA, Point pointC, Color color) {
        this.pointA = pointA;
        this.pointC = pointC;
        this.setColor(color);
        validate();
    }


    @Override
    public double getArea() {
        double width = Math.abs(pointA.getX() - pointC.getX());
        double height = Math.abs(pointA.getY() - pointC.getY());
        return width * height;
    }

    @Override
    public double getPerimeter() {
        double width = Math.abs(pointA.getX() - pointC.getX());
        double height = Math.abs(pointA.getY() - pointC.getY());
        return 2 * (width + height);
    }

    @Override
    public void move(double moveX, double moveY) {
        pointA.setX(pointA.getX() + moveX);
        pointA.setY(pointA.getY() + moveY);
        pointC.setX(pointC.getX() + moveX);
        pointC.setY(pointC.getY() + moveY);
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Прямоугольник");
        System.out.println("Координаты точи A:" + this.pointA.getX() + " " + this.pointA.getY());
        System.out.println("Координаты точи C:" + this.pointC.getX() + " " + this.pointC.getY());
        System.out.println("Периметр" + this.getPerimeter());
        System.out.println("Площадь" + this.getArea());
        System.out.println("Цвет:" + getColor());
    }
}
