package ui;

import data.Order;
import models.Drink;
import models.GarlicKnots;
import models.Pizza;
import models.Topping;

import java.util.Scanner;

public class UserInterface {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    Scanner scanner = new Scanner(System.in);

    public void start(){
       Order order = new Order();
        homeDisplay();
    }

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
        Pizza pizza = new Pizza();

        System.out.println("Select your crust: ");
        CrustType selectedOption;
        this.crustMenu();
        int choice = scanner.nextInt();
        selectedOption = (CrustType)CrustType.fromOptionNumber(choice).orElse((CrustType)null);
        this.handleMenuChoice(selectedOption, pizza);
        System.out.println("Select your size: ");
        PizzaSize selectedSize;
        this.pizzaSizeMenu();
        choice = scanner.nextInt();
        selectedSize = (PizzaSize)PizzaSize.fromOptionNumber(choice).orElse((PizzaSize)null);
        this.handleMenuChoice(selectedSize, pizza);

        System.out.println("            TOPPINGS   ");
        System.out.println(GREEN + "⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯" + RESET);
        System.out.println(RED + "⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯" + RESET);
        Topping topping = new Topping();

        MeatOption selectedMeat;
        System.out.println("Choose a meat option or continue:");
        do {
            this.meatOptionDisplay();
            choice = scanner.nextInt();
            selectedMeat = (MeatOption)MeatOption.fromOptionNumber(choice).orElse((MeatOption)null);
            topping.addMeat(selectedMeat);
            System.out.println("Topping(s) chosen:");

            topping.totalMeat();

            if (selectedMeat != MeatOption.CONTINUE) {
                System.out.println("\nChoose another meat option or continue:");
            }
        } while(selectedMeat != MeatOption.CONTINUE);

        CheeseOption selectedCheese;
        System.out.println("Choose a cheese option or continue:");
        do {
            this.cheeseOptionDisplay();
            choice = scanner.nextInt();
            selectedCheese = (CheeseOption)CheeseOption.fromOptionNumber(choice).orElse((CheeseOption)null);
            topping.addCheese(selectedCheese);
            System.out.println("Topping(s) chosen:");

            topping.totalCheese();

            if (selectedCheese != CheeseOption.CONTINUE) {
                System.out.println("\nChoose another cheese option or continue:");
            }
        } while(selectedCheese != CheeseOption.CONTINUE);

        RegularTopping selectedTopping;
        System.out.println("Choose a regular topping option or continue:");
        do {
            this.regularToppingDisplay();
            choice = scanner.nextInt();
            selectedTopping = (RegularTopping)RegularTopping.fromOptionNumber(choice).orElse((RegularTopping)null);
            topping.addRegularTopping(selectedTopping);
            System.out.println("Topping(s) chosen:");
            topping.totalRegularTopping();
            if (selectedTopping != RegularTopping.CONTINUE) {
                System.out.println("\nChoose another regular topping option or continue:");
            }
        } while(selectedTopping != RegularTopping.CONTINUE);

        SauceOption selectedSauce;
        System.out.println("Choose a sauce option or continue:");
        do {
            this.sauceOptionDisplay();
            choice = scanner.nextInt();
            selectedSauce = (SauceOption)SauceOption.fromOptionNumber(choice).orElse((SauceOption)null);
            topping.addSauce(selectedSauce);
            System.out.println("Topping(s) chosen:");

            topping.totalSauce();

            if (selectedSauce != SauceOption.CONTINUE) {
                System.out.println("\nChoose another sauce option or continue:");
            }
        } while(selectedSauce != SauceOption.CONTINUE);


        SideOption selectedSide;
        System.out.println("Choose a side option or continue:");
        do {
            this.sideOptionDisplay();
            choice = scanner.nextInt();
            selectedSide = (SideOption)SideOption.fromOptionNumber(choice).orElse((SideOption)null);
            topping.addSide(selectedSide);
            System.out.println("Side(s) chosen:");

            topping.totalSide();

            if (selectedSide != SideOption.CONTINUE) {
                System.out.println("\nChoose another side option or continue:");
            }
        } while(selectedSide != SideOption.CONTINUE);

        pizza.setToppings(topping);

        System.out.println("Would you like stuffed crust?");
        scanner.nextLine();
        String chosenOption = scanner.nextLine();
        if(chosenOption.equalsIgnoreCase("yes")) {
            pizza.setStuffedCrust(true);
        } else {
            pizza.setStuffedCrust(false);
        }

        System.out.println("Would you like extra meat?");
         chosenOption = scanner.nextLine();
        if(chosenOption.equalsIgnoreCase("yes")) {
            pizza.setExtraMeat(true);
        } else {
            pizza.setExtraMeat(false);
        }

        System.out.println("Would you like extra cheese?");
        chosenOption = scanner.nextLine();
        if(chosenOption.equalsIgnoreCase("yes")) {
            pizza.setExtraCheese(true);
        } else {
            pizza.setExtraCheese(false);
        }

        pizza.totalPizzaDisplay();

    }
    public void drinkDisplay() {
        Drink drink = new Drink();
        System.out.println("Select your drink size:");
        DrinkOptions selectedOption;
        this.DrinkMenu();
        String choice = scanner.nextLine();
        selectedOption = (DrinkOptions)DrinkOptions.fromOptionNumber(choice).orElse((DrinkOptions)null);
        this.handleMenuChoice(selectedOption, drink);
    }

    public void garlicKnotDisplay() {
        GarlicKnots garlicknot = new GarlicKnots();

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

    private void meatOptionDisplay() {
        for(MeatOption option : MeatOption.values()) {
            System.out.printf("%-3d%s%n", option.getOptionNumber(), option.getOptionName());
        }

        System.out.println();
    }

    private void cheeseOptionDisplay() {
        for(CheeseOption option : CheeseOption.values()) {
            System.out.printf("%-3d%s%n", option.getOptionNumber(), option.getOptionName());
        }

        System.out.println();
    }

    private void regularToppingDisplay() {
        for(RegularTopping option : RegularTopping.values()) {
            System.out.printf("%-3d%s%n", option.getOptionNumber(), option.getOptionName());
        }

        System.out.println();
    }
    private void sauceOptionDisplay() {
        for(SauceOption option : SauceOption.values()) {
            System.out.printf("%-3d%s%n", option.getOptionNumber(), option.getOptionName());
        }

        System.out.println();
    }

    private void sideOptionDisplay() {
        for(SideOption option : SideOption.values()) {
            System.out.printf("%-3d%s%n", option.getOptionNumber(), option.getOptionName());
        }

        System.out.println();
    }

    private void DrinkMenu() {
        for(DrinkOptions option : DrinkOptions.values()) {
            System.out.printf("%-3d%s%n", option.getOptionSize(), option.getOptionName());
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


    private void handleMenuChoice(PizzaSize option, Pizza pizza) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {

            switch (option) {
                case EIGHT:
                    pizza.setPizzaSize("8\"");
                    break;

                case TWELVE:
                    pizza.setPizzaSize("12\"");
                    break;

                case SIXTEEN:
                    pizza.setPizzaSize("16\"");

            }


        }
    }

    private void handleMenuChoice(DrinkOptions option, Drink drink) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {

            switch (option) {
                case SMALL:
                    drink.setSize("Small");
                    break;

                case MEDIUM:
                    drink.setSize("Medium");
                    break;

                case LARGE:
                    drink.setSize("Large");

            }


        }
    }

    private void handleMenuChoice(CrustType option, Pizza pizza) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {

            switch (option) {
                case THIN:
                    pizza.setCrustType("Thin Crust");
                    break;

                case REGULAR:
                    pizza.setCrustType("Regular Crust");
                    break;

                case THICK:
                    pizza.setCrustType("Thick Crust");
                    break;

                case CAULIFLOWER:
                    pizza.setCrustType("Cauliflower Crust");

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
