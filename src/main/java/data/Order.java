package data;

import models.Drink;
import models.GarlicKnots;
import models.Pizza;

import java.util.ArrayList;

public class Order {
    private ArrayList<Pizza> pizza = new ArrayList<>();
    private ArrayList<Drink> drink = new ArrayList<>();
    private ArrayList<GarlicKnots> garlicKnot = new ArrayList<>();
    private double price;

    public Order(ArrayList<Pizza> pizza, ArrayList<Drink> drink, ArrayList<GarlicKnots> garlicKnot, double price) {
        this.pizza = pizza;
        this.drink = drink;
        this.garlicKnot = garlicKnot;
        this.price = price;
    }

    public Order() {
    }

    // adding individual food items to the order

    public void addPizza(Pizza pizza) {
        this.pizza.add(pizza);
    }
    public void addDrink(Drink drink){
        this.drink.add(drink);
    }

    public void addGarlicKnots(GarlicKnots garlicKnot) {
        this.garlicKnot.add(garlicKnot);
    }

    public ArrayList<Pizza> getPizza() {
        return pizza;
    }

    public ArrayList<GarlicKnots> getGarlicKnot() {
        return garlicKnot;
    }

    public ArrayList<Drink> getDrink() {
        return drink;
    }
//calculating total price of pizza(s), drink(s) and garlic knots

    public void calculatePrice () {
        double runningTotal = 0;
            for (Pizza item : pizza) {
                runningTotal += item.getPrice();
            }
            for (Drink item : drink) {
                runningTotal += item.getPrice();
            }
            for (GarlicKnots item : garlicKnot) {
                runningTotal += item.getPrice();
            }

            this.price = runningTotal;
    }

    // displaying entire order

    public void displayTotalOrder() {

        for (Pizza item : pizza) {
            item.totalPizzaDisplay();
            System.out.println(formatPrice(item.getPrice()));
        }

        if (!drink.isEmpty()) {
            System.out.println("            DRINKS:");
        }
        for (Drink item : drink) {
            System.out.println(item.getSize() + " Drink");
            System.out.println(formatPrice(item.getPrice()));
        }

        if (!garlicKnot.isEmpty()) {
            System.out.println("            OTHERS:");
        }
        for (GarlicKnots item : garlicKnot) {
            System.out.println("Garlic Knot");
            System.out.println(formatPrice(item.getPrice()));
        }

        System.out.println("Total: " + formatPrice(this.price));

    }

    public String stringTotalOrder() {
        StringBuilder stringy = new StringBuilder();

        for (Pizza item : pizza) {
            stringy.append(item.totalPizzaString()+"\n");
            stringy.append(formatPrice(item.getPrice())+"\n");
        }

        for (Drink item : drink) {
            stringy.append(item.getSize() + " Drink\n");
            stringy.append(formatPrice(item.getPrice())+"\n");
        }

        for (GarlicKnots item : garlicKnot) {
            stringy.append("Garlic Knot\n");
            stringy.append(formatPrice(item.getPrice())+"\n");
        }

        stringy.append("Total: " + formatPrice(this.price));
//        stringy.append(String.format("Total: $%.2f", this.price));

        return stringy.toString();
    }

    public String formatPrice(double price) {
        return String.format("$%.2f", price);
    }

}
