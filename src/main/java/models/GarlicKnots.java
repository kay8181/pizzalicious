package models;

import java.time.LocalDateTime;

public class GarlicKnots {
    private double price;
    private LocalDateTime dateTime;

    public GarlicKnots() {
        this.price = 1.50;
        this.dateTime = LocalDateTime.now();

    }
    public double getPrice() {
        return price;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

}
