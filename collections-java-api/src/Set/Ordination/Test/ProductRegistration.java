package Set.Ordination.Test;

import Set.Ordination.Domain.Product;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {
    //Attribute
    private Set<Product> productSet;

    public ProductRegistration() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(long code, String name, double price, int quantity){
        productSet.add(new Product(code, name, price, quantity));
    }

    public Set<Product> showProductsByName() {
        Set<Product> productsByName = new TreeSet<>(productSet);
        return productsByName;
    }

    public Set<Product> showProductsByPrice(){
        Set<Product> productsByPrice = new TreeSet<>(new Product.ComparatorByPrice());
        productSet.addAll(productSet);
        return productsByPrice;
    }

    public static void main(String[] args) {
        // Creating an instance of ProductCatalog
        ProductRegistration productCatalog = new ProductRegistration();

        // Adding products to the catalog
        productCatalog.addProduct(1L, "Smartphone", 1000d, 10);
        productCatalog.addProduct(2L, "Notebook", 1500d, 5);
        productCatalog.addProduct(1L, "Mouse", 30d, 20);
        productCatalog.addProduct(4L, "Keyboard", 50d, 15);

        // Displaying all products in the catalog
        System.out.println(productCatalog.productSet);

        // Displaying products sorted by name
        System.out.println(productCatalog.showProductsByName());

        // Displaying products sorted by price
        System.out.println(productCatalog.showProductsByPrice());
    }


}
