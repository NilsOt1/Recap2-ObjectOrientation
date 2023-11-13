package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Sleeping bag", "1a", 129.99, true);
        Product product2 = new Product("pen", "2a", 0.99, true);
        Product product3 = new Product("Paper", "3a", 0.29, true);
        Product product4 = new Product("Desk", "4a", 319.99, true);

        ProductRepo productList = new ProductRepo();

        Order order1 = new Order("Sleeping bag", 1, 129.99);
        Order order2 = new Order("Paper", 1, 0.29);
        Order order3 = new Order("Desk", 1, 319.99);

        OrderListRepo orderList = new OrderListRepo();

        productList.addProduct(1, product1);
        productList.addProduct(2, product2);
        productList.addProduct(3, product3);
        productList.addProduct(4, product4);

        orderList.addOrder(order1);
        orderList.addOrder(order2);

        System.out.println(orderList);

        System.out.println(orderList.queryOrder(order2));


    }
}