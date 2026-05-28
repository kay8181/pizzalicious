package ui;

import java.util.Arrays;
import java.util.Optional;

public enum MeatOption {
    PEPPERONI(1, "Pepperoni"),
    SAUSAGE(2, "Sausage"),
    HAM(3, "Ham"),
    BACON(4, "Bacon"),
    CHICKEN(5, "Chicken"),
    MEATBALL(6, "Meatball"),
    CONTINUE(0, "Continue");

    private final int optionNumber;
    private final String optionName;

    private MeatOption(int optionNumber, String optionName) {
        this.optionNumber = optionNumber;
        this.optionName = optionName;

    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public String getOptionName() {
        return optionName;
    }
    public static Optional<MeatOption> fromOptionNumber(int optionNumber) {
        return Arrays.stream(values()).filter((option) -> option.optionNumber == optionNumber).findFirst();
    }
}
