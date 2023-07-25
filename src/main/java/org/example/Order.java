package org.example;

import java.util.ArrayList;

public class Order {
    Buyer buyer;
    Product product;
    int quantity;

    public Order(Buyer buyer, Product product, int quantity) {
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
    }

    public static Order makePurchase(Buyer buyer, Product product, int quantity,
                                     ArrayList<Buyer> listBuyers, ArrayList<Product> listProducts)
            throws CustomerException, ProductException, AmountException {
        if (!searchBuyer(buyer, listBuyers)) throw new CustomerException();
        if (!searchProduct(product, listProducts)) throw new ProductException();
        if (quantity < 1 || quantity > 100) throw new AmountException();
        return new Order(buyer, product, quantity);
    }

    private static Boolean searchBuyer(Buyer buyer, ArrayList<Buyer> listBuyers) {
        for (Buyer b : listBuyers) {
            if (b.equals(buyer)) {
                return true;
            }
        }
        return false;
    }

    private static Boolean searchProduct(Product product, ArrayList<Product> listProducts) {
        for (Product p : listProducts) {
            if (p.equals(product)) {
                return true;
            }
        }
        return false;
    }
}
