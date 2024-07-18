package core.basesyntax;

public class ArrayService {
    private static final FigureSupplier supplier = new FigureSupplier();

    public static void drawArrayElements(Figure[] figures) {
        for (Figure figure : figures) {
            figure.draw();
        }
    }

    public static void fillingArray(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            if (i< figures.length/2){
                figures[i] = supplier.getRandomFigure();
            }
            else
                figures[i]= supplier.getDefaultFigure();
        }
    }
}
