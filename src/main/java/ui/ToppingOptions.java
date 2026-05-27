package ui;

public enum ToppingOptions {
    MEAT(1, "Meat (Not Included):"),
    CHEESE(2, "Cheese (Not Included):"),
    REGULAR_TOPPINGS(3, "Regular Toppings (Included):"),
    SAUCES(4, "Sauces (Included):");

    private final int optionNumber;
    private final String optionName;

    private ToppingOptions(int optionNumber, String optionName) {
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
