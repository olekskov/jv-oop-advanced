package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier colorService = new ColorSupplier();
    private final int COUNT = 4;

    public Figure getRandomFigure() {
        Figure figure;
        String color = colorService.getRandomColor();
        int figureNumber = random.nextInt(COUNT);

        if (figureNumber == 0) {
            figure = new IsoscelesTrapezoid(color, random.nextInt(15), random.nextInt(15), random.nextInt(15));
        } else if (figureNumber == 1) {
            figure = new Rectangle(color, random.nextInt(15), random.nextInt(15));
        } else if (figureNumber == 2) {
            figure = new RightTriangle(color, random.nextInt(15), random.nextInt(15));
        } else {
            figure = new Square(color, random.nextInt(15));
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }
}
