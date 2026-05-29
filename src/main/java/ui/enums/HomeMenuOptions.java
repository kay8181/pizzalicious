package ui.enums;

import java.util.Arrays;
import java.util.Optional;

public enum HomeMenuOptions {
    NEW_ORDER(1, "New Order"),
    EXIT(0, "Exit");

    private final int optionNumber;
    private final String optionName;

    private HomeMenuOptions(int optionNumber, String optionName) {
        this.optionNumber = optionNumber;
        this.optionName = optionName;

    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public String getOptionName() {
        return optionName;
    }

    public static Optional<HomeMenuOptions> fromOptionNumber(int optionNumber) {
        return Arrays.stream(values()).filter((option) -> option.optionNumber == optionNumber).findFirst();
    }

}
