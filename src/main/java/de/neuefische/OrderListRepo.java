package de.neuefische;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderListRepo {
    List<Order> orderList = new ArrayList<>();

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orderList=" + orderList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo that = (OrderListRepo) o;
        return Objects.equals(orderList, that.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderList);
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void removeOrder(Order order) {
        orderList.remove(order);
    }

    public Order queryOrder(Order searchedOrder) {
        for (Order order : orderList) {
            if (order == searchedOrder) {
                return order;
            }
        } return null;
    }
}
