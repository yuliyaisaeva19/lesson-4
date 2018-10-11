package ru.const24;

public class Product {
    private String productName;
    Money price;

    Product(String productName, Money price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ru.const24.Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}