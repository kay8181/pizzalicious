package ui;

import java.util.Arrays;
import java.util.Optional;

public enum OrderMenuOptions {
    ADD_PIZZA(1, "Add Pizza"),
    ADD_DRINK(2, "Add Drink"),
    ADD_GARLIC_KNOTS(3, "Add Garlic Knots"),
    CHECKOUT(4, "Checkout"),
    CANCEL_ORDER(0, "Cancel Order");

    private final int optionNumber;
    private final String optionName;

    private OrderMenuOptions(int optionNumber, String optionName) {
        this.optionNumber = optionNumber;
        this.optionName = optionName;

    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public String getOptionName() {
        return optionName;
    }

    public static Optional<OrderMenuOptions> fromOptionNumber(int optionNumber) {
        return Arrays.stream(values()).filter((option) -> option.optionNumber == optionNumber).findFirst();
    }

    private void OrderMenu() {
        for(OrderMenuOptions option : OrderMenuOptions.values()) {
            System.out.printf("%-3d - %s%n", option.getOptionNumber(), option.getOptionName());
        }

        System.out.println();
    }

}
