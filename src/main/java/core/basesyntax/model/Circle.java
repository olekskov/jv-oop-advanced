package core.basesyntax.model;

import core.basesyntax.enums.Color;

import static java.lang.Math.PI;
import static java.lang.System.lineSeparator;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: %s, area: %.2f sq. units, radius: %d centimeter, color: %s %s",
                getClass().getSimpleName(), getArea(), radius, getColor(), lineSeparator());
    }

}
