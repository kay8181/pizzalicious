package models;

import data.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ToppingTest {
    @Test
    public void totalMeat_should_return_ArrayList_Of_Meat() {
        Topping topping = new Topping();
        ArrayList<String> expectedMeat = new ArrayList();

        expectedMeat.add("Peperoni");
        expectedMeat.add("Ham");
        expectedMeat.add("Sausage");

        topping.setMeat(expectedMeat);

        ArrayList<String> actualMeat = topping.getMeat();

        assertEquals(expectedMeat, actualMeat);

    }

}