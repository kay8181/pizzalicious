package models;

import java.util.ArrayList;

public class Topping {
    boolean extraMeat;
    boolean extraCheese;
    ArrayList<String> meat;
    ArrayList<String> cheese;
    ArrayList<String> regularToppings;
    ArrayList<String> sauces;
    ArrayList<String> sides;

    public Topping() {
        this.extraCheese = false;
        this.extraMeat = false;
        this.meat = new ArrayList<String>();
        this.cheese = new ArrayList<String>();
        this.regularToppings = new ArrayList<String>();
        this.sauces = new ArrayList<String>();
        this.sides = new ArrayList<String>();

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

    public void setSauces(ArrayList<String> sauces) {
        this.sauces = sauces;
    }

    public void setSides(ArrayList<String> sides) {
        this.sides = sides;
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

    public ArrayList<String> getSauces() {
        return sauces;
    }

    public ArrayList<String> getSides() {
        return sides;
    }


}
