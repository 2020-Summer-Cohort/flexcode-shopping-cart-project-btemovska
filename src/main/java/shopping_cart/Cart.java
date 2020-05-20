package shopping_cart;

import java.util.ArrayList;

public class Cart {

    ArrayList<Item> itemsList = new ArrayList<>();

    public void addItems(String name, double price, int quantity) {
        itemsList.add(new Item(name, price, quantity));
    }

    public void removeItems(String name) {
        for (int i = itemsList.size() - 1; i >= 0; i--) {
            if (itemsList.get(i).getName().equals(name)) {
                itemsList.remove(i);
            }
        }
    }

    public void showAllItems() {
        for(int i = 0; i < itemsList.size(); i++) {
            System.out.println(itemsList.get(i));
        }
    }

    public int getTotalItems() {
        int items = 0;
        for(Item item: itemsList) {
            items += item.getQuantity();
        }
        return items;
    }

//    public double getTotalPrice() {
//        double price = 0.00;
//        for(Item item: itemsList) {
//            price += item.getPrice();
//        }
//        return price;
//    }
}
