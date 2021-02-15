package com.alevel.lesson16;

import java.math.BigDecimal;
import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        if ((product1.getCategory().getCategoryId() - product2.getCategory().getCategoryId()) == 0){

        }
        return product1.getPrice().intValue()-product2.getPrice().intValue();

    }
}
