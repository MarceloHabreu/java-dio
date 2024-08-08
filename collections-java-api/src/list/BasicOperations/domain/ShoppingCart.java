package list.BasicOperations.domain;

import list.BasicOperations.test.Item;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList;

    public ShoppingCart(){
        this.itemList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity){
        itemList.add(new Item(name, price, quantity));
    }

    public void removeItem(String name){
        List<Item> itensToRemove = new ArrayList<>();
        if(!itemList.isEmpty()){
        for(Item i : itemList) {
            if (i.getName().equalsIgnoreCase(name)) {
                itensToRemove.add(i);
            }
        }
            itemList.removeAll(itensToRemove);
        } else {
            System.out.println("The list is empty!");
        }
    }

    public double calculateTotalValue() {
        double totalvalue = 0d;
        if(!itemList.isEmpty()) {
            for (Item i : itemList) {
                double itemValue = i.getPrice() * i.getQuantity();
                totalvalue += itemValue;
            }
            return totalvalue;
        } else {
            throw new RuntimeException("The list is empty!");
        }
    }

    public void viewItems() {
        if(!itemList.isEmpty()){
            System.out.println(this.itemList);
        } else {
            System.out.println("The list is empty!");
        }
    }

}
