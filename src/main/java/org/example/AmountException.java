package org.example;

public class AmountException extends RuntimeException {
    public AmountException() {
        super("Некорректное количество !");
    }
}
