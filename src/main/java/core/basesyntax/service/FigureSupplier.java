package core.basesyntax.service;

import core.basesyntax.enums.Color;
import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;

import java.util.Random;

import static core.basesyntax.enums.Color.WHITE;

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
        Color color = colorService.getRandomColor();
        int figureNumber = random.nextInt(FIGURES_COUNT);

        switch (figureNumber) {
            case 0 -> {
                return new IsoscelesTrapezoid(color, getRandomSide(), getRandomSide(), getRandomSide());
            }
            case 1 -> {
                return new Rectangle(color, getRandomSide(), getRandomSide());
            }
            case 2 -> {
                return new RightTriangle(color, getRandomSide(), getRandomSide());
            }
            default -> {
                return new Square(color, getRandomSide());
            }
        }
    }

    private int getRandomSide() {
        return random.nextInt(MAX_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE, DEFAULT_RADIUS);
    }
}
