package com.kata.potter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by sterui on 2/2/17.
 */
public class PotterTest {

    @Mock
    private Potter potter;

    private List<Books> shoppingBag;

    @Before
    public void setUp() {
        potter = new Potter();
        shoppingBag = new ArrayList<>();

    }

    @Test
    public void checkoutWithZeroBooks() {


            assertEquals(potter.checkout(shoppingBag), 0.0, 0.01);

    }

    @Test
    public void checkoutWithOneBook() {
        Books one = new Books(1, "Hp one");
        shoppingBag.add(one);

        assertEquals(potter.checkout(shoppingBag), 8.0, 0.01);

    }

    @Test
    public void checkoutWithTwoSameBooks() {
        Books one = new Books(1, "Hp one");
        shoppingBag.add(one);
        Books two = new Books(1, "Hp one");
        shoppingBag.add(two);

        assertEquals(potter.checkout(shoppingBag), 16.0, 0.01);

    }

    @Test
    public void checkoutWithTwoDifferentBooks() {
        Books one = new Books(1, "Hp one");
        shoppingBag.add(one);
        Books two = new Books(2, "Hp two");
        shoppingBag.add(two);

        assertEquals(potter.checkout(shoppingBag), 15.2, 0.01);

    }

    @Test
    public void checkoutWithThreeDifferentBooks() {
        Books one = new Books(1, "Hp one");
        shoppingBag.add(one);
        Books two = new Books(2, "Hp two");
        shoppingBag.add(two);
        Books three = new Books(3, "Hp three");
        shoppingBag.add(three);


        assertEquals(potter.checkout(shoppingBag), 21.6, 0.01);

    }

    @Test
    public void checkoutWithThreeSameBooks() {
        Books one = new Books(2, "Hp two");
        shoppingBag.add(one);
        Books two = new Books(2, "Hp two");
        shoppingBag.add(two);
        Books three = new Books(2, "Hp two");
        shoppingBag.add(three);

        assertEquals(potter.checkout(shoppingBag), 24.0, 0.01);

    }

    @Test
    public void checkoutWithLastRequirement() {
        Books one = new Books(2, "Hp two");
        shoppingBag.add(one);
        Books two = new Books(2, "Hp two");
        shoppingBag.add(two);
        Books three = new Books(1, "Hp one");
        shoppingBag.add(three);
        Books four = new Books(1, "Hp one");
        shoppingBag.add(four);
        Books five = new Books(3, "Hp three");
        shoppingBag.add(five);
        Books six = new Books(3, "Hp three");
        shoppingBag.add(six);
        Books seven = new Books(4, "Hp four");
        shoppingBag.add(seven);
        Books eight = new Books(5, "Hp five");
        shoppingBag.add(eight);

        assertEquals(potter.checkout(shoppingBag), 51.2, 0.01);

    }
}