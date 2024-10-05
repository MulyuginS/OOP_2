package shapes;

import colors.Color;

public class Triangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
        validate();
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
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
        double a = distance(pointA, pointB);
        double b = distance(pointB, pointC);
        double c = distance(pointC, pointA);
        double area = (a + b + c) / 2;

        if (area == 0) {
            throw new IllegalArgumentException("Не удалось создать фигуру, т.к. точки лежат на одной прямой");
        }
    }

    public Triangle() {
    }

    public Triangle(Point pointA, Point pointB, Point pointC, Color color) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.setColor(color);
        validate();
    }

    @Override
    public double getArea() {
        double a = distance(pointA, pointB);
        double b = distance(pointB, pointC);
        double c = distance(pointC, pointA);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return distance(pointA, pointB) + distance(pointB, pointC) + distance(pointC, pointA);
    }

    @Override
    public void move(double moveX, double moveY) {
        pointA.setX(pointA.getX() + moveX);
        pointA.setY(pointA.getY() + moveY);
        pointB.setX(pointB.getX() + moveX);
        pointB.setY(pointB.getY() + moveY);
        pointC.setX(pointC.getX() + moveX);
        pointC.setY(pointC.getY() + moveY);
    }

    private double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public void draw() {
        System.out.println("Фигура: Треугольник");
        System.out.println("Координаты точи A:" + this.pointA.getX() + " " + this.pointA.getY());
        System.out.println("Координаты точи B:" + this.pointB.getX() + " " + this.pointB.getY());
        System.out.println("Координаты точи C:" + this.pointC.getX() + " " + this.pointC.getY());
        System.out.println("Периметр" + this.getPerimeter());
        System.out.println("Площадь" + this.getArea());
        System.out.println("Цвет:" + getColor());
    }
}
