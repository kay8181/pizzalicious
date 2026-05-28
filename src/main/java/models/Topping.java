package models;

import ui.*;

import java.util.ArrayList;

public class Topping {
    boolean extraMeat;
    boolean extraCheese;
    ArrayList<String> meat;
    ArrayList<String> cheese;
    ArrayList<String> regularToppings;
    ArrayList<String> sauce;
    ArrayList<String> side;

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

    public void addMeat(MeatOption option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            switch (option) {
                case PEPPERONI:
                    this.meat.add("Pepperoni");
                    break;
                case SAUSAGE:
                    this.meat.add("Sausage");
                    break;
                case HAM:
                    this.meat.add("Ham");
                    break;
                case BACON:
                    this.meat.add("Bacon");
                    break;
                case CHICKEN:
                    this.meat.add("Chicken");
                    break;
                case MEATBALL:
                    this.meat.add("Meatball");
                    break;
                case CONTINUE:
            }

        }
    }

    public void addCheese(CheeseOption option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            switch (option) {
                case MOZZARELLA:
                    this.cheese.add("Mozzarella");
                    break;
                case PARMESAN:
                    this.cheese.add("Parmesan");
                    break;
                case RICOTTA:
                    this.cheese.add("Ricotta");
                    break;
                case GOAT_CHEESE:
                    this.cheese.add("Goat Cheese");
                    break;
                case BUFFALO:
                    this.cheese.add("Buffalo");
                    break;
                case CONTINUE:
            }

        }
    }

    public void addRegularTopping(RegularTopping option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            switch (option) {
                case ONIONS:
                    this.regularToppings.add("Onions");
                    break;
                case MUSHROOMS:
                    this.regularToppings.add("Mushrooms");
                    break;
                case BELL_PEPPERS:
                    this.regularToppings.add("Bell Peppers");
                    break;
                case OLIVES:
                    this.regularToppings.add("Olives");
                    break;
                case TOMATOES:
                    this.regularToppings.add("Tomatoes");
                    break;
                case SPINACH:
                    this.regularToppings.add("Spinach");
                    break;
                case BASIL:
                    this.regularToppings.add("Basil");
                    break;
                case PINEAPPLE:
                    this.regularToppings.add("Pineapple");
                    break;
                case ANCHOVIES:
                    this.regularToppings.add("Anchovies");
                    break;
                case CONTINUE:
            }

        }
    }

    public void addSauce(SauceOption option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            switch (option) {
                case MARINARA:
                    this.sauce.add("Marinara");
                    break;
                case ALFREDO:
                    this.sauce.add("Alfredo");
                    break;
                case PESTO:
                    this.sauce.add("Pesto");
                    break;
                case BBQ:
                    this.sauce.add("BBQ");
                    break;
                case BUFFALO:
                    this.sauce.add("Buffalo");
                    break;
                case OLIVE_OIL:
                    this.sauce.add("Olive Oil");
                    break;
                case CONTINUE:
            }

        }
    }

    public void addSide(SideOption option) {
        if (option == null) {
            System.out.println("Invalid option. Please try again.");
        } else {
            switch (option) {
                case RED_PEPPER:
                    this.side.add("Red Pepper");
                    break;
                case PARMESAN:
                    this.side.add("Parmesan");
                    break;
                case CONTINUE:
            }

        }
    }

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






}