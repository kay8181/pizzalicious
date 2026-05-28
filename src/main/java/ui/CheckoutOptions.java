package ui;

import java.util.Arrays;
import java.util.Optional;

public enum CheckoutOptions {
    CONFIRM(1, "Confirm"),
    CANCEL(0, "Cancel");

    private final int optionNumber;
    private final String optionName;

    private CheckoutOptions(int optionNumber, String optionName) {
        this.optionNumber = optionNumber;
        this.optionName = optionName;

    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public String getOptionName() {
        return optionName;
    }
    public static Optional<CheckoutOptions> fromOptionNumber(int optionNumber) {
        return Arrays.stream(values()).filter((option) -> option.optionNumber == optionNumber).findFirst();
    }
}
