package ui;

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
}
