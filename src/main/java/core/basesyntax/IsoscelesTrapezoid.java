package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int longSide;
    private int shortSide;

    public IsoscelesTrapezoid(String color, int height, int longSide, int shortSide) {
        super(color);
        this.height = height;
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double getArea() {
        return ((height + longSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: %s, area: %.2f sq. units, height: %d centimeter, longSide %d centimeter, shortSide %d centimeter, color: %s %s",
                getClass().getSimpleName(), getArea(), height, longSide, shortSide, getColor(), System.lineSeparator());
    }
}
