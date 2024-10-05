package service.impl;

import colors.Color;
import service.ShapeService;
import shapes.Shape;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class ShapesServiceImpl implements ShapeService {
    @Override
    public double getsquares(List<Shape> shapeList){
    double sum = 0;
    for(Shape shape : shapeList){
        sum += shape.getArea();
    }

        return sum;
    }
    @Override
    public double getMaxPerimeteres(List<Shape> shapeList){
        double maxPerimeteres = -1;

        for (Shape shape : shapeList) {
            if (shape.getPerimeter() > maxPerimeteres) {
                maxPerimeteres = shape.getPerimeter();
            }
        }

        return maxPerimeteres;
    }
    @Override
    public Set<Color> getColors(List<Shape> shapeList) {
        Set<Color> set = new HashSet<>();
        for (Shape shape : shapeList) {
            set.add(shape.getColor());
        }
        return set;
    }



}
