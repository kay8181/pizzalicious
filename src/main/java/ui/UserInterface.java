package ui;

import java.util.Scanner;

public class UserInterface {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    Scanner scanner = new Scanner(System.in);

    public UserInterface() {
    }

    //displaying menu and accepting user input

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
    public void orderDisplay() {

        OrderMenuOptions selectedOption;
        do {
            this.menuHeader("            ORDER MENU   ");
            this.orderMenu();
            int choice = scanner.nextInt();
            selectedOption = (OrderMenuOptions)OrderMenuOptions.fromOptionNumber(choice).orElse((OrderMenuOptions)null);
            this.handleMenuChoice(selectedOption);
        } while(selectedOption != OrderMenuOptions.CANCEL_ORDER);

    }

    public void pizzaDisplay() {
        System.out.println("Select your crust: ");
        CrustType selectedOption;
        this.crustMenu();
        int choice = scanner.nextInt();
        selectedOption = (CrustType)CrustType.fromOptionNumber(choice).orElse((CrustType)null);
        this.handleMenuChoice(selectedOption);
        System.out.println("Select your size: ");
        PizzaSize selectedSize;
        this.pizzaSizeMenu();
        choice = scanner.nextInt();
        selectedSize = (PizzaSize)PizzaSize.fromOptionNumber(choice).orElse((PizzaSize)null);
        this.handleMenuChoice(selectedSize);
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

    //displaying menu options

    private void homeMenu() {
        for(HomeMenuOptions option : HomeMenuOptions.values()) {
            System.out.printf("%-3d%s%n", option.getOptionNumber(), option.getOptionName());
        }

        System.out.println();
    }
    private void orderMenu() {
        for(OrderMenuOptions option : OrderMenuOptions.values()) {
            System.out.printf("%-3d%s%n", option.getOptionNumber(), option.getOptionName());
        }

        System.out.println();
    }
    private void crustMenu() {
        for(CrustType option : CrustType.values()) {
            System.out.printf("%-3d%s%n", option.getOptionNumber(), option.getOptionName());
        }

        System.out.println();
    }

    private void pizzaSizeMenu() {
        for(PizzaSize option : PizzaSize.values()) {
            System.out.printf("%-3d%s%n", option.getOptionNumber(), option.getOptionName());
        }

        System.out.println();
    }

    //switch cases to make user input work with menu choices

    private void handleMenuChoice(HomeMenuOptions option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            switch (option) {
                case NEW_ORDER:
                    this.orderDisplay();
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
                    this.pizzaDisplay();
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


}
