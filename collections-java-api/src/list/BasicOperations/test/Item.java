package list.BasicOperations.test;

import list.BasicOperations.domain.ShoppingCart;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return "-------------\n" +
                "Name: " + name + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + quantity + "\n";
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        // Displaying the items in the cart
        cart.viewItems();
        // Adding items to cart
        cart.addItem("Milk", 2.84, 3 );
        cart.addItem("Notebook", 35, 2 );
        cart.addItem("Rubber", 2, 6 );
        // Displaying the updated items in the cart
        cart.viewItems();
        // Removing an item from the cart
        cart.removeItem("Notebook");
        // Displaying the updated items in the cart
        System.out.println("Displaying the updated after to remove item in the cart!");
        cart.viewItems();
    }
}
