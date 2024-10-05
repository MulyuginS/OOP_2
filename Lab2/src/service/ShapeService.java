package service;

import colors.Color;
import shapes.Shape;

import java.util.List;
import java.util.Set;
public interface ShapeService {
    double getsquares(List<Shape> shapeList);
    double getMaxPerimeteres(List<Shape> shapeList);
    Set<Color> getColors(List<Shape> shapeList);
}
