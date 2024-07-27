package core.basesyntax.model;

import core.basesyntax.enums.Color;

import static java.lang.System.lineSeparator;

public class Rectangle extends Figure {
    private int height;
    private int weight;

    public Rectangle(Color color, int height, int weight) {
        super(color);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double getArea() {
        return height * weight;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: %s, area: %.2f sq. units, height: %d centimeter, weight %d centimeter, "
                        + "color: %s %s",
                getClass().getSimpleName(), getArea(), height, weight, getColor(), lineSeparator());
    }
}

