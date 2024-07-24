package core.basesyntax.service;

import core.basesyntax.model.Figure;
import java.util.Random;

public class ArrayService {
    private final FigureSupplier supplier = new FigureSupplier(new Random(),
            new ColorSupplier(new Random()));

    public void drawArrayElements(Figure[] figures) {
        for (Figure figure : figures) {
            figure.draw();
        }
    }

    public void fillArray(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
        }
    }

}
