package ui.enums;

import java.util.Arrays;
import java.util.Optional;

public enum RegularTopping {
    ONIONS(1, "Onions"),
    MUSHROOMS(2, "Mushrooms"),
    BELL_PEPPERS(3, "Bell Peppers"),
    OLIVES(4, "Olives"),
    TOMATOES(5, "Tomatoes"),
    SPINACH(6, "Spinach"),
    BASIL(7, "Basil"),
    PINEAPPLE(8, "Pineapple"),
    ANCHOVIES(9, "Anchovies"),
    CONTINUE(0, "Continue");

    private final int optionNumber;
    private final String optionName;

    private RegularTopping(int optionNumber, String optionName) {
        this.optionNumber = optionNumber;
        this.optionName = optionName;

    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public String getOptionName() {
        return optionName;
    }
    public static Optional<RegularTopping> fromOptionNumber(int optionNumber) {
        return Arrays.stream(values()).filter((option) -> option.optionNumber == optionNumber).findFirst();
    }
}
