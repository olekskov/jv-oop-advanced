package core.basesyntax.model;

import static java.lang.System.lineSeparator;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: %s, area: %.2f sq. units, height: %d centimeter, color: %s %s",
                getClass().getSimpleName(), getArea(), side, getColor(), lineSeparator());
    }
}

