package data;

import models.Drink;
import models.GarlicKnots;
import models.Pizza;

import java.util.ArrayList;

public class Order {
    ArrayList<Pizza> pizza;
    ArrayList<Drink> drink;
    ArrayList<GarlicKnots> garlicKnot;
    double price;

    public Order(ArrayList<Pizza> pizza, ArrayList<Drink> drink, ArrayList<GarlicKnots> garlicKnot, double price) {
        this.pizza = pizza;
        this.drink = drink;
        this.garlicKnot = garlicKnot;
        this.price = price;
    }

    public Order() {
    }

    public void addPizza(Pizza pizza) {
        this.pizza.add(pizza);
    }
    public void addDrink(Drink drink){
        this.drink.add(drink);
    }

    public void addGarlicKnots(GarlicKnots garlicKnot) {
        this.garlicKnot.add(garlicKnot);
    }

    public void calculatePrice () {
       double runningTotal = 0;
        for(Pizza item : pizza) {
            runningTotal += item.getPrice();
        }
        for(Drink item : drink) {
            runningTotal += item.getPrice();
        }
        for(GarlicKnots item : garlicKnot) {
            runningTotal += item.getPrice();
        }

        this.price = runningTotal;
    }

}
