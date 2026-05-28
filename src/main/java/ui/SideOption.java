package ui;

import java.util.Arrays;
import java.util.Optional;

public enum SideOption {
    RED_PEPPER(1, "Red Pepper"),
    PARMESAN(2, "Parmesean"),
    CONTINUE(0, "Continue");

    private final int optionNumber;
    private final String optionName;

    private SideOption(int optionNumber, String optionName) {
        this.optionNumber = optionNumber;
        this.optionName = optionName;

    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public String getOptionName() {
        return optionName;
    }
    public static Optional<SideOption> fromOptionNumber(int optionNumber) {
        return Arrays.stream(values()).filter((option) -> option.optionNumber == optionNumber).findFirst();
    }
}
