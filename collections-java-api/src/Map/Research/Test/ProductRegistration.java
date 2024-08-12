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

    public double calculateTotalStockValue() {
        double valueTotalStock = 0d;
        if (!productRegistrationMap.isEmpty()){
            for (Product p : productRegistrationMap.values()){
                valueTotalStock += p.getQuantity() * p.getPrice();
            }
        }
        return valueTotalStock;
    }

    public Product getMostExpensiveProduct() {
        Product productMoreExpensive = null;
        double highestPrice = Double.MIN_VALUE;
        if (!productRegistrationMap.isEmpty()) {
            for (Product p : productRegistrationMap.values()) {
                if (p.getPrice() > highestPrice) {
                    productMoreExpensive = p;
                    highestPrice = p.getPrice();
                }
            }
        }
        return productMoreExpensive;
    }
    public Product getCheapestProduct() {
        Product productMoreCheapest = null;
        double cheapestPrice = Double.MAX_VALUE;
        if (!productRegistrationMap.isEmpty()) {
            for (Product p : productRegistrationMap.values()) {
                if (p.getPrice() < cheapestPrice) {
                    productMoreCheapest = p;
                    cheapestPrice = p.getPrice();
                }
            }
        }
        return productMoreCheapest;
    }


    public Product getProductWithHighestQuantityValueInStock(){
        Product productHighestQuantityValueInStock = null;
        double highesTotalValueProductStock = 0d;
        if (!productRegistrationMap.isEmpty()){
            for (Map.Entry<Long, Product> entry : productRegistrationMap.entrySet()){
                double productValueInStock = entry.getValue().getPrice() * entry.getValue().getQuantity();
                if(productValueInStock > highesTotalValueProductStock){
                    highesTotalValueProductStock = productValueInStock;
                    productHighestQuantityValueInStock = entry.getValue();
                }
            }
        }
        return productHighestQuantityValueInStock;
    }

    public static void main(String[] args) {
        ProductRegistration stock = new ProductRegistration();

        // Displays the empty stock
        stock.addProduct(1L,"Notebook", 1, 1500.0);
        stock.addProduct(2L,"Mouse", 2, 25.0);
        stock.addProduct(3L,"Monitor", 1, 400.0);
        stock.addProduct(4L, "keyboard", 2, 40.0);

        //  Displays the products in stock
        stock.showAllProducts();

        // Calculates and displays the total stock value
        System.out.println("Total stock value: $" + stock.calculateTotalStockValue());

        // Gets and displays the most expensive product
        Product mostExpensiveProduct = stock.getMostExpensiveProduct();
        System.out.println("Most expensive product: " + mostExpensiveProduct);

        // Gets and displays the cheapest product
        Product cheapestProduct = stock.getCheapestProduct();
        System.out.println("Cheapest product: " + cheapestProduct);

        // Gets and displays the product with the highest quantity in stock value
        Product highestQuantityValueProductInStock = stock.getProductWithHighestQuantityValueInStock();
        System.out.println("Product with highest quantity in stock value: " + highestQuantityValueProductInStock);

    }
}
