package core.basesyntax.model;

import core.basesyntax.enums.Color;

import static java.lang.System.lineSeparator;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int longSide;
    private int shortSide;

    public IsoscelesTrapezoid(Color color, int height, int longSide, int shortSide) {
        super(color);
        this.height = height;
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double getArea() {
        return (double) ((shortSide + longSide) / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: %s, area: %.2f sq. units, height: %d centimeter, longSide %d centimeter,"
                        + " shortSide %d centimeter, color: %s %s",
                getClass().getSimpleName(), getArea(), height, longSide,
                shortSide, getColor(), lineSeparator());
    }
}
