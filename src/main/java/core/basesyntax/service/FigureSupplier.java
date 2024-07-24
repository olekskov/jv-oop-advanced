package core.basesyntax.service;

import static core.basesyntax.enums.Color.WHITE;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 4;
    private static final int MAX_VALUE = 15;
    private static final int DEFAULT_RADIUS = 10;

    private final Random random;
    private final ColorSupplier colorService;

    public FigureSupplier(Random random, ColorSupplier colorService) {
        this.random = random;
        this.colorService = colorService;
    }

    public Figure getRandomFigure() {
        Figure figure;
        String color = colorService.getRandomColor();
        int figureNumber = random.nextInt(FIGURES_COUNT);

        switch (figureNumber) {
            case 0 -> figure = new IsoscelesTrapezoid(color, getRandomSide(), getRandomSide(),
                    getRandomSide());
            case 1 -> figure = new Rectangle(color, getRandomSide(), getRandomSide());
            case 2 -> figure = new RightTriangle(color, getRandomSide(), getRandomSide());
            default -> figure = new Square(color, getRandomSide());
        }
        return figure;
    }

    private int getRandomSide() {
        return random.nextInt(MAX_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE.name(), DEFAULT_RADIUS);
    }
}
