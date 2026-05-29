package models;

public class Drink {
    String size;
    double price;

    public Drink() {
    }

    public String getSize() {
        return size;
    }


    public double getPrice() {
        return price;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Drink(String size) {
        this.size = size;
        calculatePrice();

    }

    //calculating price based on chosen size

    public void calculatePrice() {
        if(size.equalsIgnoreCase("Small")) {
            this.price = 2.00;
        }
        else if(size.equalsIgnoreCase("Medium")) {
            this.price = 2.50;
        }
        else if(size.equalsIgnoreCase("Large")) {
            this.price = 3.00;
        }
        else
            this.price = 0;

    }
}
