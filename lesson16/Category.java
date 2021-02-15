package com.alevel.lesson16;

public class Category {
    String name;
    long categoryId;
    Category(String name, long categoryId){
        this.name = name;
        this.categoryId = categoryId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}
