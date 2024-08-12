package Map.Research.Test;
import Map.Research.Domain.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRegistration {
    //Attribute
    private Map<Long, Product> productRegistrationMap;

    public ProductRegistration() {
        this.productRegistrationMap = new HashMap<>();
    }

    //Methods
    public void addProduct(Long code, String name, int quantity, double price){
        productRegistrationMap.put(code, new Product(name, price, quantity));
    }

    public void showAllProducts(){
        System.out.println(productRegistrationMap);
    }

    public double CalculateTotalStockValue() {
        double valueTotalStock = 0d;
        if (!productRegistrationMap.isEmpty()){
            for (Product p : productRegistrationMap.values()){
                valueTotalStock += p.getQuantity() * p.getPrice();
            }
        }
        return valueTotalStock;
    }

    public Product getProductMoreExpensive() {
        Product productMoreExpensive = null;
        double highestPrice = Double.MIN_VALUE;
        if (!productRegistrationMap.isEmpty()) {
            for (Product p : productRegistrationMap.values()) {
                if (p.getPrice() > highestPrice) {
                    productMoreExpensive = p;
                }
            }
        }
        return productMoreExpensive;
    }
}
