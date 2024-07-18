package core.basesyntax.service;

import core.basesyntax.model.*;

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
        Figure figure;
        String color = colorService.getRandomColor();
        int figureNumber = random.nextInt(FIGURES_COUNT);

        switch (figureNumber) {
            case 0 -> figure = new IsoscelesTrapezoid(color, getRandomSide(), getRandomSide(), getRandomSide());
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
        return new Circle(WHITE.toString(), DEFAULT_RADIUS);
    }
}
