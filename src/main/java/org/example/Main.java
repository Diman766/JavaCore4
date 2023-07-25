package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Buyer> listBuyers = new ArrayList<>(2);
        listBuyers.add(new Buyer("Pavel", "88888", 45));
        listBuyers.add(new Buyer("Petr", "99999", 40));

        ArrayList<Product> listProducts = new ArrayList<>(5);
        listProducts.add(new Product("Sausage", 250));
        listProducts.add(new Product("Cheese", 350));
        listProducts.add(new Product("Milk", 100));
        listProducts.add(new Product("Bread", 35));
        listProducts.add(new Product("Butter", 150));

        ArrayList<Order> listOrders = new ArrayList<>(5);

        Buyer buyer1 = new Buyer("Pavel", "88888", 45);
        Product product1 = new Product("Sausage", 250);


        try {
            listOrders.add(Order.makePurchase(buyer1, product1, 0, listBuyers, listProducts));

        } catch (ProductException e) {
            System.out.println("Нет такого продукта !");

        } catch (AmountException e) {
            listOrders.add(Order.makePurchase(buyer1, product1, 1, listBuyers, listProducts));

        } catch (CustomerException e) {
            e.printStackTrace();

        } finally {
            System.out.println(listOrders.size());
        }
    }
}