package com.kata.potter;

import java.util.List;

/**
 * Created by sterui on 2/2/17.
 */
public class Potter {



    public double checkout(List<Books> shoppingBag) {
        if (shoppingBag.isEmpty()) return 0.0;

        if (shoppingBag.size() == 1) return 8.0;

        checkOrder(shoppingBag);

        double sum = calculateTotal(shoppingBag);

        return sum;

    }

    private double calculateTotal(List<Books> shoppingBag) {

        double total= 0.0;
        for (int i=0;i<shoppingBag.size();i++) {
            total += shoppingBag.get(i).getPrice();
        }
        return total;
    }

    private void checkOrder(List<Books> shoppingBag) {

        int diffBooks =0;
        for (int i=0;i<shoppingBag.size();i++) {
            for (int j=0;j<shoppingBag.size();j++) {
                if (shoppingBag.get(i).getId() != shoppingBag.get(j).getId()) {
                    diffBooks++;
                }
            }
                if (diffBooks > 0) {
                    shoppingBag.get(i).setPrice(calculatePercentage(checkDiscount(diffBooks)));
                    diffBooks = 0;
                }

            }
    }

    private double checkDiscount(int diffBooks) {
        double discount ;
        switch (diffBooks) {
            case 1:
                discount = 5.0;
                break;
            case 2:
                discount = 10.0;
                break;
            case 3:
                discount = 15.0;
                break;
            case 4:
                discount = 20.0;
                break;
            default: discount = 20.0;
        }
        return discount;

    }

    private double calculatePercentage(double i) {
        double perc = 8.0 * (i/100);
        return 8.0 - perc;
    }
}
