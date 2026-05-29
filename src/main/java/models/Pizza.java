package models;

public class Pizza {
    private String crustType;
    private String pizzaSize;
    private Topping toppings;
    private boolean stuffedCrust;
    private boolean extraCheese;
    private boolean extraMeat;
    private double price;

    public Pizza() {
    }

    public Pizza(String crustType, String pizzaSize, Topping toppings, boolean stuffedCrust, boolean extraCheese, boolean extraMeat) {
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

    public String getPizzaSize() {
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
    public void setPizzaSize(String pizzaSize) {
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

    //displaying pizza type and toppings

    public void totalPizzaDisplay() {
        System.out.println("            CUSTOMIZED PIZZA:");
        System.out.println(this.crustType + "\n" + this.pizzaSize);
        this.toppings.totalMeat();
        this.toppings.totalCheese();
        this.toppings.totalRegularTopping();
        this.toppings.totalSauce();
        this.toppings.totalSide();
        if (this.stuffedCrust) {
            System.out.println("Stuffed Crust");
        }if (this.extraCheese) {
            System.out.println("Extra Cheese");
        }
        if (this.extraMeat) {
            System.out.println("Extra Meat");
        }

    }

    public String totalPizzaString() {
        StringBuilder stringy = new StringBuilder();

        stringy.append("            CUSTOMIZED PIZZA:\n");
        stringy.append(this.crustType + "\n" + this.pizzaSize+"\n");
        if(!this.toppings.totalMeatString().isEmpty()) {
            stringy.append(this.toppings.totalMeatString()+"\n");
        }
        if(!this.toppings.totalCheeseString().isEmpty()) {
            stringy.append(this.toppings.totalCheeseString() + "\n");
        }
        if(!this.toppings.totalRegularToppingString().isEmpty()) {
            stringy.append(this.toppings.totalRegularToppingString() + "\n");
        }
        if(!this.toppings.totalSauceString().isEmpty()) {
            stringy.append(this.toppings.totalSauceString() + "\n");
        }
        if(!this.toppings.totalSideString().isEmpty()) {
            stringy.append(this.toppings.totalSideString() + "\n");
        }
        if (this.stuffedCrust) {
            stringy.append("Stuffed Crust\n");
        }if (this.extraCheese) {
            stringy.append("Extra Cheese\n");
        }
        if (this.extraMeat) {
            stringy.append("Extra Meat\n");
        }
        return stringy.toString();
        }

    //calculating pizza price based on size, extras and chosen toppings

    public void calculatePizzaPrice() {
        double runningTotal = 0;
        switch(this.pizzaSize) {
            case "8\"":
                runningTotal += 8.50;
                if(this.toppings.getMeat().size() > 0) {
                    runningTotal += 1.00;
                }
                if(this.toppings.isExtraMeat()) {
                    runningTotal += .50;
                }
                if(this.toppings.getCheese().size() > 0) {
                    runningTotal += .75;
                }
                if(this.toppings.isExtraCheese()) {
                    runningTotal += .30;
                }
                break;
            case "12\"":
                runningTotal += 12.00;
                if(this.toppings.getMeat().size() > 0) {
                    runningTotal += 2.00;
                }
                if(this.toppings.isExtraMeat()) {
                    runningTotal += 1.00;
                }
                if(this.toppings.getCheese().size() > 0) {
                    runningTotal += 1.50;
                }
                if(this.toppings.isExtraCheese()) {
                    runningTotal += .60;
                }
                break;
            case "16\"":
                runningTotal += 16.50;
                if(this.toppings.getMeat().size() > 0) {
                    runningTotal += 3.00;
                }
                if(this.toppings.isExtraMeat()) {
                    runningTotal += 1.50;
                }
                if(this.toppings.getCheese().size() > 0) {
                    runningTotal += 2.25;
                }
                if(this.toppings.isExtraCheese()) {
                    runningTotal += .90;
                }
        }
        this.price = runningTotal;
    }




}
