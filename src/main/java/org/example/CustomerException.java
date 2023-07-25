package org.example;

public class CustomerException extends RuntimeException {
    public CustomerException() {
        super("Нет такого покупателя в базе !");
    }
}
