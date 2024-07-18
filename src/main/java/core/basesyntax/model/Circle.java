package core.basesyntax.model;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
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
                getClass().getSimpleName(), getArea(), radius, getColor(), System.lineSeparator());
    }

}
