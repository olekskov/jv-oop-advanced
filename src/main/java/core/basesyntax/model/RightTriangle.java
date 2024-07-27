package core.basesyntax.model;

import core.basesyntax.enums.Color;

import static java.lang.System.lineSeparator;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * secondLeg * firstLeg;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: %s, area: %.2f sq. units, firstLeg: %d centimeter, "
                        + "secondLeg: %d centimeter, color: %s %s",
                getClass().getSimpleName(), getArea(), firstLeg, secondLeg,
                getColor(), lineSeparator());
    }
}

