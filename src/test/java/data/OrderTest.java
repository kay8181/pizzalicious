package data;

import models.Pizza;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    public void addPizza_should_addPizza() {
        Order order = new Order();
        Pizza pizza = new Pizza();
        ArrayList<Pizza> expected = new ArrayList();

        expected.add(pizza);

        order.addPizza(pizza);

        ArrayList<Pizza> actual = order.getPizza();

        assertEquals(expected, actual);

    }

}