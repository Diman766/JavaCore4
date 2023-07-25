package org.example;

public class ProductException extends RuntimeException {
    public ProductException() {
        super("Нет такого продукта !");
    }
}
