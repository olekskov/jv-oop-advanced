package core.basesyntax;

public class Square extends Figure {
    private int height;

    public Square(String color, int hight) {
        super(color);
        this.height = hight;
    }

    @Override
    public double getArea() {
        return Math.pow(height, 2);
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: %s, area: %.2f sq. units, height: %d centimeter, color: %s %s",
                getClass().getSimpleName(), getArea(), height, getColor(), System.lineSeparator());
    }
}

