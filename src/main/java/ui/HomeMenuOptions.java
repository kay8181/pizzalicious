package ui;

public enum HomeMenuOptions {
    New_Order(1, "New Order"),
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

}
