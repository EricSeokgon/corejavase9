package ch01.sec06;

import java.util.ArrayList;

public class Invoice {
    private static class Item {  // Invoice 내부에 Item을 중첩 했다.
        String description;
        int quantity;
        double unitPrice;

        double price() {
            return quantity * unitPrice;
        }

        private ArrayList<Item> items = new ArrayList<>();
    }

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        //items.add(newItem);
    }
}
