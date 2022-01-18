package app;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class User {
    String login;
    String password;
    int    balance;

    Cart cart;

    public boolean isBalanceEnough() {
    }
}

class Cart {
    ArrayList<Item> items;
}

class Item {
    int quantity;
    Product product;

    Item(Product product, int quantity) {
        this.quantity = quantity;
        this.product = product;
    }
}

class Product {
    String name;
    int price;
}

class ShopService {
    public void call(User currentUser, Product product, int quantity) {
        currentUser.cart.items.add(new Item(product, quantity));
    }
}

class OrderService {
    public void call(User currentUser) throws Exception {
        if (currentUser.isBalanceEnough(currentUser.cart.cost())) {

        } else {
            throw new Exception("Недостаточно денег");
        }
    }
}
