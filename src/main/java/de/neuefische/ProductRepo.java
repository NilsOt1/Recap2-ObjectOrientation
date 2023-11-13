package de.neuefische;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductRepo {
    Map<Integer, Product> productMap = new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(productMap, that.productMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productMap);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "productMap=" + productMap +
                '}';
    }

    public void addProduct(int productKey, Product product) {
        productMap.put(productKey, product);
    }

    public void removeProduct(int productKey) {
        productMap.remove(productKey);
    }
    public Product queryProduct(int productKey) {
        return productMap.get(productKey);
    }
}
