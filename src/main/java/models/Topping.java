package models;

import ui.enums.*;

import java.util.ArrayList;

public class Topping {
    private boolean extraMeat;
    private boolean extraCheese;
    private ArrayList<String> meat;
    private ArrayList<String> cheese;
    private ArrayList<String> regularToppings;
    private ArrayList<String> sauce;
    private ArrayList<String> side;

    public Topping() {
        this.extraCheese = false;
        this.extraMeat = false;
        this.meat = new ArrayList<String>();
        this.cheese = new ArrayList<String>();
        this.regularToppings = new ArrayList<String>();
        this.sauce = new ArrayList<String>();
        this.side = new ArrayList<String>();

    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public void setMeat(ArrayList<String> meat) {
        this.meat = meat;
    }

    public void setCheese(ArrayList<String> cheese) {
        this.cheese = cheese;
    }

    public void setRegularToppings(ArrayList<String> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public void setSauce(ArrayList<String> sauce) {
        this.sauce = sauce;
    }

    public void setSide(ArrayList<String> side) {
        this.side = side;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public ArrayList<String> getMeat() {
        return meat;
    }

    public ArrayList<String> getCheese() {
        return cheese;
    }

    public ArrayList<String> getRegularToppings() {
        return regularToppings;
    }

    public ArrayList<String> getSauce() {
        return sauce;
    }

    public ArrayList<String> getSide() {
        return side;
    }

    //adding chosen items to list of toppings

    public void addMeat(MeatOption option) {

        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            if(duplicateCheck(meat, option.getOptionName())) {
                System.out.println("Option already added.");
            }
            else {
                switch (option) {
                    case PEPPERONI, SAUSAGE, HAM, CHICKEN, MEATBALL, BACON:
                        this.meat.add(option.getOptionName());
                        break;
                    case CONTINUE:
                }
            }
        }
    }

    public void addCheese(CheeseOption option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            if(duplicateCheck(cheese, option.getOptionName())) {
                System.out.println("Option already added.");
            }
            else {
                switch (option) {
                    case MOZZARELLA, PARMESAN, RICOTTA, GOAT_CHEESE, BUFFALO:
                        this.cheese.add(option.getOptionName());
                        break;
                    case CONTINUE:
                }
            }

        }
    }

    public void addRegularTopping(RegularTopping option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            if(duplicateCheck(regularToppings, option.getOptionName())) {
            System.out.println("Option already added.");
            }
            else {
                switch (option) {
                    case ONIONS,MUSHROOMS, BELL_PEPPERS, OLIVES,TOMATOES, SPINACH, BASIL,PINEAPPLE, ANCHOVIES:
                    this.regularToppings.add(option.getOptionName());
                    break;
                    case CONTINUE:
                }
            }

        }
    }

    public void addSauce(SauceOption option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            if(duplicateCheck(sauce, option.getOptionName())) {
                System.out.println("Option already added.");
            }
            else {
                switch (option) {
                    case MARINARA,ALFREDO, PESTO, BBQ, BUFFALO, OLIVE_OIL:
                        this.sauce.add(option.getOptionName());
                        break;
                    case CONTINUE:
                }

            }


        }
    }

    public void addSide(SideOption option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            switch (option) {
                case RED_PEPPER, PARMESAN:
                    this.side.add(option.getOptionName());
                    break;
                case CONTINUE:
            }

        }
    }

    //showing chosen toppings

    public void totalMeat () {
        for (String meat : this.meat) {
            System.out.println(meat);
        }
    }

    public void totalCheese() {
        for (String cheese : this.cheese) {
            System.out.println(cheese);
        }
    }
    public void totalRegularTopping() {
        for(String regularTopping : this.regularToppings) {
            System.out.println(regularTopping);
        }
    }

    public void totalSauce() {
        for (String sauce : this.sauce) {
            System.out.println(sauce);
        }
    }

    public void totalSide(){
        for (String side : this.side) {
            System.out.println(side);
        }
    }

    //returning items to be recorded in the receipt
    public String totalMeatString () {
        StringBuilder stringy = new StringBuilder();

        for (String meat : this.meat) {
            stringy.append(meat);
        }

        return stringy.toString();
    }

    public String totalCheeseString () {
        StringBuilder stringy = new StringBuilder();
                
        for (String cheese : this.cheese) {
            stringy.append(cheese);
        }

        return stringy.toString();
    }

    public String totalRegularToppingString () {
        StringBuilder stringy = new StringBuilder();

        for (String regularTopping : this.regularToppings) {
            stringy.append(regularTopping);
        }

        return stringy.toString();
    }

    public String totalSauceString () {
        StringBuilder stringy = new StringBuilder();

        for (String sauce : this.sauce) {
            stringy.append(sauce);
        }

        return stringy.toString();
    }

    public String totalSideString () {
        StringBuilder stringy = new StringBuilder();

        for (String side : this.side) {
            stringy.append(side);
        }

        return stringy.toString();
    }

    // checking for duplicate topping picks

    public boolean duplicateCheck(ArrayList<String> list, String searchTerm) {

        long count = list.stream()
                .filter(item -> item.toLowerCase().contains(searchTerm.toLowerCase()))
                .count();
        return count > 0;
    }

    public String formatPrice(double price) {
        return String.format("$.2f", price);
    }





}