package ui.enums;

import java.util.Arrays;
import java.util.Optional;

public enum CheeseOption {
    MOZZARELLA(1, "Mozzarella"),
    PARMESAN(2, "Parmesan"),
    RICOTTA(3, "Ricotta"),
    GOAT_CHEESE(4, "Goat Cheese"),
    BUFFALO(5, "Buffalo"),
    CONTINUE(0, "Continue");

    private final int optionNumber;
    private final String optionName;

    private CheeseOption(int optionNumber, String optionName) {
        this.optionNumber = optionNumber;
        this.optionName = optionName;

    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public String getOptionName() {
        return optionName;
    }
    public static Optional<CheeseOption> fromOptionNumber(int optionNumber) {
        return Arrays.stream(values()).filter((option) -> option.optionNumber == optionNumber).findFirst();
    }
}

