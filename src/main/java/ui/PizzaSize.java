package ui;

public enum PizzaSize {
    EIGHT(1, "8\""),
    TWELVE(2, "12\""),
    SIXTEEN(3, "16\"");

    private final int optionNumber;
    private final String optionName;

    private PizzaSize(int optionNumber, String optionName) {
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
