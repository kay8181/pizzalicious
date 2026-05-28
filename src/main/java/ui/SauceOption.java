package ui;

import java.util.Arrays;
import java.util.Optional;

public enum SauceOption {
    MARINARA(1, "Marinara"),
    ALFREDO(2, "Alfredo"),
    PESTO(3, "Pesto"),
    BBQ(4, "BBQ"),
    BUFFALO(5, "Buffalo"),
    OLIVE_OIL(6, "Olive Oil"),
    CONTINUE(0, "Continue");

    private final int optionNumber;
    private final String optionName;

    private SauceOption(int optionNumber, String optionName) {
        this.optionNumber = optionNumber;
        this.optionName = optionName;

    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public String getOptionName() {
        return optionName;
    }
    public static Optional<SauceOption> fromOptionNumber(int optionNumber) {
        return Arrays.stream(values()).filter((option) -> option.optionNumber == optionNumber).findFirst();
    }
}
