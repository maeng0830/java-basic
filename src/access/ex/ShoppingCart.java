package access.ex;

import java.util.ArrayList;

public class ShoppingCart {
    private static final int maxCount = 10;
    private ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        if (items.size() < maxCount) {
            items.add(item);
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println("name:" + item.getName() + " price:" + item.getPrice() + " quantity:" + item.getQuantity());
        }
    }
}
