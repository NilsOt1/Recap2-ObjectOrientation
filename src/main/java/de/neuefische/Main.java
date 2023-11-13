package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Product sleepingBag = new Product("Sleeping bag", "1a", 129.99, true);

        ProductRepo repo = new ProductRepo();

        repo.addProduct(1, sleepingBag);

        System.out.println("Queried product: " + repo.queryProduct(1));


    }
}