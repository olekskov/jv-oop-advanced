package core.basesyntax.service;

import core.basesyntax.model.Figure;

public class ArrayService {
    private final FigureSupplier figureSupplier;

    public ArrayService(FigureSupplier figureSupplier) {
        this.figureSupplier = figureSupplier;
    }

    public void drawArrayElements(Figure[] figures) {
        for (Figure figure : figures) {
            figure.draw();
        }
    }

    public void fillArray(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
    }

}
