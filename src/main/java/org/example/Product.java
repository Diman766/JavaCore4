package org.example;

public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Product product = (Product) o;

        if (!getName().equals(product.getName())) {
            return false;
        }
        return getPrice() == product.getPrice();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
