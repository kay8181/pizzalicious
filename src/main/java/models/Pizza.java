package models;

public class Pizza {
    String crustType;
    int pizzaSize;
    Topping toppings;
    boolean stuffedCrust;
    boolean extraCheese;
    boolean extraMeat;
    double price;

    public Pizza(String crustType, int pizzaSize, Topping toppings, boolean stuffedCrust, boolean extraCheese, boolean extraMeat) {
        this.crustType = crustType;
        this.pizzaSize = pizzaSize;
        this.toppings = toppings;
        this.stuffedCrust = stuffedCrust;
        this.extraCheese = extraCheese;
        this.extraMeat = extraMeat;
    }


    public String getCrustType() {
        return crustType;
    }

    public int getPizzaSize() {
        return pizzaSize;
    }

    public Topping getToppings() {
        return toppings;
    }
    public double getPrice() {
        return price;
    }

    public boolean isStuffedCrust() {
        return stuffedCrust;
    }


    public boolean isExtraCheese() {
        return extraCheese;
    }


    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }
    public void setPizzaSize(int pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void setToppings(Topping toppings) {
        this.toppings = toppings;
    }

    public void setStuffedCrust(boolean stuffedCrust) {
        this.stuffedCrust = stuffedCrust;
    }
    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
