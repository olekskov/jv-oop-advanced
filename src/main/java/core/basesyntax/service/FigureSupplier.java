package core.basesyntax.service;

import core.basesyntax.enums.Color;
import core.basesyntax.model.*;

import java.util.Random;

public class FigureSupplier {
    private  final Random random = new Random();
    private  final ColorSupplier colorService = new ColorSupplier();
    private static final int FIGURES_COUNT = 4;
    private static final int MAX_VALUE = 15;

    public Figure getRandomFigure() {
        Figure figure;
        String color = colorService.getRandomColor();
        int figureNumber = random.nextInt(FIGURES_COUNT);

        if (figureNumber == 0) {
            figure = new IsoscelesTrapezoid(color, random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE), random.nextInt(15));
        } else if (figureNumber == 1) {
            figure = new Rectangle(color, random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
        } else if (figureNumber == 2) {
            figure = new RightTriangle(color, random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
        } else {
            figure = new Square(color, random.nextInt(MAX_VALUE));
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }
}
