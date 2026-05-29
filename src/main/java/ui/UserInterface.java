package ui;

import data.Order;
import data.receiptWriter;
import models.Drink;
import models.GarlicKnots;
import models.Pizza;
import models.Topping;
import ui.enums.*;

import java.util.Scanner;

public class UserInterface {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    Scanner scanner = new Scanner(System.in);

    public void start(){
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

        Order order = new Order();

        OrderMenuOptions selectedOption;
        do {
            this.menuHeader("            ORDER MENU   ");
            this.orderMenu();
            int choice = scanner.nextInt();
            selectedOption = (OrderMenuOptions)OrderMenuOptions.fromOptionNumber(choice).orElse((OrderMenuOptions)null);
            this.handleMenuChoice(selectedOption, order);
        } while(selectedOption != OrderMenuOptions.CANCEL_ORDER);

    }

    public CrustType pizzaCrustDisplay() {
        System.out.println("Select your crust: ");
        CrustType selectedOption;
        this.crustMenu();
        int choice = scanner.nextInt();
        selectedOption = (CrustType)CrustType.fromOptionNumber(choice).orElse((CrustType)null);

        return selectedOption;
    }

    public PizzaSize pizzaSizeDisplay() {
        System.out.println("Select your size: ");
        PizzaSize selectedSize;
        this.pizzaSizeMenu();
        int choice = scanner.nextInt();
        selectedSize = (PizzaSize)PizzaSize.fromOptionNumber(choice).orElse((PizzaSize)null);

        return selectedSize;
    }

    public void pizzaMeatTopping(Topping topping) {
        MeatOption selectedMeat;
        System.out.println("Choose a meat option or continue:");
        do {
            this.meatOptionDisplay();
            int choice = scanner.nextInt();
            selectedMeat = (MeatOption)MeatOption.fromOptionNumber(choice).orElse((MeatOption)null);
            topping.addMeat(selectedMeat);
            System.out.println("Meat(s) chosen:");

            topping.totalMeat();

            if (selectedMeat != MeatOption.CONTINUE) {
                System.out.println("\nChoose another meat option or continue:");
            }
        } while(selectedMeat != MeatOption.CONTINUE);

    }

    public void pizzaCheeseTopping(Topping topping) {
        CheeseOption selectedCheese;
        System.out.println("\nChoose a cheese option or continue:");
        do {
            this.cheeseOptionDisplay();
            int choice = scanner.nextInt();
            selectedCheese = (CheeseOption)CheeseOption.fromOptionNumber(choice).orElse((CheeseOption)null);
            topping.addCheese(selectedCheese);
            System.out.println("Cheese(s) chosen:");

            topping.totalCheese();

            if (selectedCheese != CheeseOption.CONTINUE) {
                System.out.println("\nChoose another cheese option or continue:");
            }
        } while(selectedCheese != CheeseOption.CONTINUE);
    }

    public void pizzaRegularTopping(Topping topping) {
        RegularTopping selectedTopping;
        System.out.println("\nChoose a regular topping option or continue:");
        do {
            this.regularToppingDisplay();
            int choice = scanner.nextInt();
            selectedTopping = (RegularTopping)RegularTopping.fromOptionNumber(choice).orElse((RegularTopping)null);
            topping.addRegularTopping(selectedTopping);
            System.out.println("Topping(s) chosen:");
            topping.totalRegularTopping();
            if (selectedTopping != RegularTopping.CONTINUE) {
                System.out.println("\nChoose another regular topping option or continue:");
            }
        } while(selectedTopping != RegularTopping.CONTINUE);

    }

    public void pizzaSauceTopping(Topping topping) {
        SauceOption selectedSauce;
        System.out.println("\nChoose a sauce option or continue:");
        do {
            this.sauceOptionDisplay();
            int choice = scanner.nextInt();
            selectedSauce = (SauceOption)SauceOption.fromOptionNumber(choice).orElse((SauceOption)null);
            topping.addSauce(selectedSauce);
            System.out.println("Sauce(s) chosen:");

            topping.totalSauce();

            if (selectedSauce != SauceOption.CONTINUE) {
                System.out.println("\nChoose another sauce option or continue:");
            }
        } while(selectedSauce != SauceOption.CONTINUE);
    }

    public void pizzaSideTopping(Topping topping) {
        SideOption selectedSide;
        System.out.println("\nChoose a side option or continue:");
        do {
            this.sideOptionDisplay();
            int choice = scanner.nextInt();
            selectedSide = (SideOption)SideOption.fromOptionNumber(choice).orElse((SideOption)null);
            topping.addSide(selectedSide);
            System.out.println("Side(s) chosen:");

            topping.totalSide();

            if (selectedSide != SideOption.CONTINUE) {
                System.out.println("\nChoose another side option or continue:");
            }
        } while(selectedSide != SideOption.CONTINUE);
    }

    public Pizza pizzaDisplay() {
        Pizza pizza = new Pizza();

        CrustType selectedCrust = pizzaCrustDisplay();
        this.handleMenuChoice(selectedCrust, pizza);

        PizzaSize selectedSize = pizzaSizeDisplay();
        this.handleMenuChoice(selectedSize, pizza);

        menuHeader("            TOPPINGS");
        Topping topping = new Topping();

        pizzaMeatTopping(topping);
        pizzaCheeseTopping(topping);
        pizzaRegularTopping(topping);
        pizzaSauceTopping(topping);
        pizzaSideTopping(topping);

        pizza.setToppings(topping);

        System.out.println("\nWould you like stuffed crust?");
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

        pizza.calculatePizzaPrice();
        pizza.totalPizzaDisplay();

        return pizza;
    }

    public Drink drinkDisplay() {
        Drink drink = new Drink();
        System.out.println("Select your drink size:");
        DrinkOptions selectedOption;
        this.drinkMenu();
        scanner.nextLine();
        String choice = scanner.nextLine();
        selectedOption = (DrinkOptions)DrinkOptions.fromOptionNumber(choice).orElse((DrinkOptions)null);
        this.handleMenuChoice(selectedOption, drink);
        drink.calculatePrice();
        return drink;
    }

    public GarlicKnots garlicKnotDisplay() {
        GarlicKnots garlicKnot = new GarlicKnots();

        return garlicKnot;

    }
    public void checkoutDisplay(Order order) {
        menuHeader("            TOTAL ORDER");
        order.calculatePrice();
        order.displayTotalOrder();
        CheckoutOptions selectedOption;
        this.checkoutMenu();
        int choice = scanner.nextInt();
        selectedOption = (CheckoutOptions)CheckoutOptions.fromOptionNumber(choice).orElse((CheckoutOptions)null);
        this.handleMenuChoice(selectedOption, order);
    }

    private void menuHeader(String label) {
        if (label.equals("homescreen")) {

            System.out.println();
            System.out.println(RED + "        PIZZA" +GREEN +"LICIOUS\n"+ RESET);
            System.out.println("      555 Pizza Street\n     San Jose, CA 95111");
            System.out.println("        408-444-8888");

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

    private void drinkMenu() {
        for(DrinkOptions option : DrinkOptions.values()) {
            System.out.printf("%s %s%n", option.getOptionSize(), option.getOptionName());
        }

        System.out.println();
    }

    private void checkoutMenu() {
        for(CheckoutOptions option : CheckoutOptions.values()) {
            System.out.printf("%-3d%s%n", option.getOptionNumber(), option.getOptionName());
        }

        System.out.println();
    }



    //switch cases to make user input work with menu choices

    //options for home menu
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
    //options for order menu
    private void handleMenuChoice(OrderMenuOptions option, Order order) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {

            switch (option) {
                case ADD_PIZZA:
                    Pizza pizza = this.pizzaDisplay();
                    order.addPizza(pizza);
                    break;

                case ADD_DRINK:
                    order.addDrink(this.drinkDisplay());
                    break;

                case ADD_GARLIC_KNOTS:
                    GarlicKnots garlicKnots = this.garlicKnotDisplay();
                    order.addGarlicKnots(garlicKnots);
                    break;

                case CHECKOUT:
                    if(order.getPizza().isEmpty() && order.getDrink().isEmpty() && order.getGarlicKnot().isEmpty()) {
                        System.out.println("Your order is empty.");
                        System.out.println("You must add at least one pizza, a drink, or garlic knots before you can checkout.");
                    } else {
                        checkoutDisplay(order);
                    }

                    break;

                case CANCEL_ORDER:
            }


        }
    }

    //options for pizza size
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

    //options for drink size
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

    //options for crust type
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

    //options for check out
    private void handleMenuChoice(CheckoutOptions option, Order order)  {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            switch (option) {
                case CONFIRM:
                    System.out.println("Printing receipt...");
                    try {
                        receiptWriter receiptWriter = new receiptWriter(order);
                        receiptWriter.receipt();
                    }
                    catch (Exception e) {
                    }
                    break;

                case CANCEL:
            }

        }
    }


}
