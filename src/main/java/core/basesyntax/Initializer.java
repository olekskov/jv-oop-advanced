package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.service.ArrayService;

public class Initializer {
    private static final ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {

        Figure[] figures = new Figure[6];
        arrayService.fillingArray(figures);
        arrayService.drawArrayElements(figures);
    }
}
