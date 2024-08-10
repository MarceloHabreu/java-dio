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

}
