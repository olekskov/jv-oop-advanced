package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.service.ArrayService;
import core.basesyntax.service.ColorSupplier;
import core.basesyntax.service.FigureSupplier;

import java.util.Random;

public class Initializer {
    private static final ColorSupplier colorSupplier = new ColorSupplier(new Random());
    private static final FigureSupplier figureSupplier = new FigureSupplier(new Random(), colorSupplier);
    private static final ArrayService arrayService = new ArrayService(figureSupplier);

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        arrayService.fillArray(figures);
        arrayService.drawArrayElements(figures);
    }
}
