package core.basesyntax.model;

import core.basesyntax.enums.Color;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Printer;

public abstract class Figure implements AreaCalculator, Printer {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
