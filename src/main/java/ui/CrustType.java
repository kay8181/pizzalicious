package ui;

public enum CrustType {
    THIN(1, "Thin Crust"),
    REGULAR(2, "Regular Crust"),
    THICK(3, "Thick Crust"),
    CAULIFLOWER(4, "Cauliflower Crust");

    private final int optionNumber;
    private final String optionName;

    private CrustType(int optionNumber, String optionName) {
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
