package ui;

public enum DrinkOptions {
    SMALL("S", "Small"),
    MEDIUM("M", "Medium"),
    LARGE("L", "Large");

    private final String optionSize;
    private final String optionName;

    private DrinkOptions(String optionSize, String optionName) {
        this.optionSize = optionSize;
        this.optionName = optionName;

    }

    public String getOptionSize() {
        return optionSize;
    }

    public String getOptionName() {
        return optionName;
    }
}
