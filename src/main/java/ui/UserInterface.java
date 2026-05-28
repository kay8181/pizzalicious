package ui;

import java.util.Scanner;

public class UserInterface {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    Scanner scanner = new Scanner(System.in);

    public UserInterface() {
    }

    public void homeDisplay() {

        HomeMenuOptions selectedOption;
        do {
            this.menuHeader("homescreen");
            this.homeMenu();
            int choice = scanner.nextInt();
            selectedOption = (HomeMenuOptions)HomeMenuOptions.fromOptionNumber(choice).orElse((HomeMenuOptions)null);
            this.handleMenuChoice(selectedOption);
        } while(selectedOption != HomeMenuOptions.EXIT);

        System.out.println("Goodbye!");
    }


    private void menuHeader(String label) {
        if (label.equals("homescreen")) {

            System.out.println();
            System.out.println("Name");
            System.out.println("address");
            System.out.println("phonenumber");

        }
        else {
            System.out.println(label);
        }
        System.out.println(GREEN + "⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯" + RESET);
        System.out.println(RED + "⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯" + RESET);
    }

    private void homeMenu() {
        for(HomeMenuOptions option : HomeMenuOptions.values()) {
            System.out.printf("%-3d - %s%n", option.getOptionNumber(), option.getOptionName());
        }

        System.out.println();
    }

    private void handleMenuChoice(HomeMenuOptions option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            switch (option) {
                case NEW_ORDER:
                    this.orderMenuOptions();

                    break;

                case EXIT:
            }

        }
    }

    private void handleMenuChoice(OrderMenuOptions option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {

            switch (option) {
                case ADD_PIZZA:
                    break;

                case ADD_DRINK:
                    break;

                case ADD_GARLIC_KNOTS:
                    break;

                case CHECKOUT:
                    break;

                case CANCEL_ORDER:
            }


        }
    }

    private void handleMenuChoice(ToppingOptions option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {

            switch (option) {
                case MEAT:
                    break;

                case CHEESE:
                    break;

                case REGULAR_TOPPINGS:
                    break;

                case SAUCES:

            }


        }
    }

    private void handleMenuChoice(PizzaSize option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {

            switch (option) {
                case EIGHT:
                    break;

                case TWELVE:
                    break;

                case SIXTEEN:

            }


        }
    }

    private void handleMenuChoice(DrinkOptions option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {

            switch (option) {
                case SMALL:
                    break;

                case MEDIUM:
                    break;

                case LARGE:

            }


        }
    }

    private void handleMenuChoice(CrustType option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {

            switch (option) {
                case THIN:
                    break;

                case REGULAR:
                    break;

                case THICK:
                    break;

                case CAULIFLOWER:

            }


        }
    }

    private void handleMenuChoice(CheckoutOptions option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            switch (option) {
                case CONFIRM:
                    break;

                case CANCEL:
            }

        }
    }

    private void orderMenuOptions() {

    }

}
