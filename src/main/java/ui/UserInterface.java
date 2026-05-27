package ui;

import java.util.Scanner;

import static ui.HomeMenuOptions.EXIT;
import static ui.HomeMenuOptions.NEW_ORDER;

public class UserInterface {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    Scanner scanner = new Scanner(System.in);

    public UserInterface() {
    }

    public void homeDisplay() {
        //this.init();
        HomeMenuOptions selectedOption;
        do {
            this.homeMenuHeader();
            this.homeMenu();
            int choice = scanner.nextInt();
            selectedOption = (HomeMenuOptions)HomeMenuOptions.fromOptionNumber(choice).orElse((HomeMenuOptions)null);
            this.handleMenuChoice(selectedOption);
        } while(selectedOption != HomeMenuOptions.EXIT);

        System.out.println("Goodbye!");
    }


    private void homeMenuHeader() {
        System.out.println();
        System.out.println("Name");
        System.out.println("address");
        System.out.println("phonenumber");
        System.out.println(GREEN + "⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯"+ RESET);
        System.out.println(RED + "⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯"+ RESET);
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
                    break;

                case EXIT:
            }

        }
    }



}
