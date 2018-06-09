package net.zarski.conference.ci.plantshop;

public class Shop {
    private String shopName;

    public String getShopName() {
        return shopName;
    }

    public Session getCurrentSession() {
        return session;
    }

    private Session session;

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    public static void main(String... args){
        Shop shop = new Shop("Plant's shop");
        Session session = shop.registerNewSession();
        ShoppingCart shoppingCart = new ShoppingCart();
        session.put("cart", shoppingCart);

        shop.displayGreeting();
        shop.displayStatus();
    }

    private void displayStatus() {
        System.out.println(String.format("You have %s products in your cart.", ((ShoppingCart)session.get("cart")).size()));
    }

    private Session registerNewSession() {
        Session session = new Session();
        this.session = session;
        return session;
    }

    private void displayGreeting() {
        System.out.println(String.format("Welcome in %s", shopName));
    }
}
