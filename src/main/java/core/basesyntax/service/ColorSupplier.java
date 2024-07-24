package core.basesyntax.service;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        return String.valueOf(Color.values()[random.nextInt(Color.values().length)]);
    }
}
