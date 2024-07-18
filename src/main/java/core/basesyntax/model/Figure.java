package core.basesyntax.model;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Printer;

public abstract class Figure implements AreaCalculator, Printer {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
