package com.alevel.lesson16;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Product> listOfProducts = new ArrayList<>();
        TreeSet<Product> listForCompare = new TreeSet<>(new ProductComparator());

        Category fruit = new Category("Fruits", 29583123);
        Category drinks = new Category("drinks", 20083123);
        Category sweets = new Category("sweets", 29511123);
        Category meat = new Category("meat", 29583179);

        listOfProducts.add(new Product("Apple", new BigDecimal("23.47"), fruit));
        listOfProducts.add(new Product("kiwi", new BigDecimal("49.99"), fruit));
        listOfProducts.add(new Product("mango", new BigDecimal("106.05"), fruit));
        listOfProducts.add(new Product("pineapple", new BigDecimal("78.01"), fruit));

        listOfProducts.add(new Product("tea", new BigDecimal("50.75"), drinks));
        listOfProducts.add(new Product("wine", new BigDecimal("340.99"), drinks));
        listOfProducts.add(new Product("coca-cola", new BigDecimal("30.49"), drinks));
        listOfProducts.add(new Product("water", new BigDecimal("10.07"), drinks));

        listOfProducts.add(new Product("chocolate", new BigDecimal("10.07"), sweets));
        listOfProducts.add(new Product("biscuit", new BigDecimal("10.07"), sweets));
        listOfProducts.add(new Product("cake", new BigDecimal("10.07"), sweets));
        listOfProducts.add(new Product("ice cream", new BigDecimal("10.07"), sweets));

        listOfProducts.add(new Product("chicken", new BigDecimal("10.07"), meat));
        listOfProducts.add(new Product("beef", new BigDecimal("10.07"), meat));
        listOfProducts.add(new Product("pork", new BigDecimal("10.07"), meat));
        listOfProducts.add(new Product("stand meat", new BigDecimal("50.30"), meat));

        listForCompare.addAll(listOfProducts);



for (Product product: listForCompare){
    System.out.println(product);
}








    }

    static void bubbleSort(List<Product> products) {
        ProductComparator comparator = new ProductComparator();
        int productNumber = products.size();
        Product temp;
        for (int i = 0; i < productNumber; i++) {
            for (int j = 1; j < (productNumber - i); j++) {
                if (comparator.compare(products.get(j - 1), products.get(j)) > 0) {

                    temp = products.get(j - 1);
                    products.set(j - 1, products.get(j));
                    products.set(j, temp);
                }

            }
        }
    }

}

