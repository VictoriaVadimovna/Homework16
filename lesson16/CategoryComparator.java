package com.alevel.lesson16;

import java.util.Comparator;

public class CategoryComparator implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return (int) (product1.getCategory().getCategoryId()-product2.getCategory().getCategoryId());
    }
}
