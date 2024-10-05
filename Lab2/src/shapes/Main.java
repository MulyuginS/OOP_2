package shapes;
import colors.Color;
import service.impl.ShapesServiceImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(2, 1, Color.TRANSPARENT);
        Circle circle = new Circle(point, 1, Color.TRANSPARENT);
        circle.draw();
        circle.setColor(Color.RED);
        circle.setPoint(new Point(2, 2, Color.RED));
        circle.move(1, 1);
        circle.draw();

        List<Shape> list = new ArrayList<>();
        list.add(new Triangle(new Point(0, 0, Color.TRANSPARENT), new Point(0, 4, Color.TRANSPARENT), new Point(4, 0,Color.TRANSPARENT), Color.RED));
        list.add(new Circle(new Point(3, 3, Color.TRANSPARENT), 2, Color.WHITE));
        list.add(new Circle(new Point(2, 5, Color.TRANSPARENT), 4, Color.YELLOW));
        list.add(new Rectangle(new Point(1, 1, Color.TRANSPARENT), new Point(5, 2, Color.TRANSPARENT), Color.TRANSPARENT));
        list.add(new Point(100, 100, Color.TRANSPARENT));
        list.add(new Triangle(new Point(-2, 3, Color.TRANSPARENT), new Point(4, 3, Color.TRANSPARENT), new Point(2, 5, Color.TRANSPARENT), Color.BLUE));

        ShapesServiceImpl impl = new ShapesServiceImpl();

        System.out.println("Суммарная площадь фигур: " + impl.getsquares(list));
        System.out.println("Максимальный периметр фигур: " + impl.getMaxPerimeteres(list));
        System.out.println("Цвета фигур: " + impl.getColors(list));


    }
}
