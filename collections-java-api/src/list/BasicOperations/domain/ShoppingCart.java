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

}
