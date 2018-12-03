import config.DefaultBouquets;
import flowers.Flower;
import flowers.FlowerBouquet;
import flowers.FlowerGroup;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import payment_methods.Payment;
import payment_methods.PaymentContext;
import shopping_carts.Cart;
import shopping_carts.CartDiscount;
import shopping_carts.CartSundayDiscount;
import shopping_carts.RegularCart;

import java.util.ArrayList;
import java.util.HashMap;

@Getter
@Setter
@ToString
public class FlowerShop {
    private ArrayList<FlowerBouquet> bouquets = DefaultBouquets.getInstance().getDefaultBuckets();
    private ArrayList<Flower> flowers;

    public FlowerShop(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public ArrayList<FlowerBouquet> buyCart(Cart ordered, Payment payment, double money) {
        PaymentContext pay = new PaymentContext(payment);
        if (pay.pay(ordered, money)) {
            return ordered.getBouquets();
        }
        return null;

    }

    public Cart createCart(String promo) {
        if (promo.equals("days")) {
            return new CartSundayDiscount(new RegularCart());
        } else if (promo.equals("20")) {
            return new CartDiscount(new RegularCart(), 0.1);
        }
        return new RegularCart();
    }

    public FlowerBouquet createBouquete(HashMap<Integer, Integer> arr) {
        FlowerBouquet bouq = new FlowerBouquet();
        for (int key : arr.keySet()) {
            if (key > flowers.size() - 1) {
                continue;
            }
            bouq.addFlower(new FlowerGroup(flowers.get(key), arr.get(key)));
        }
        return bouq;
    }


    public void promo() {
        System.out.println("Available bouquets:");
        System.out.println(this.bouquets);
        System.out.println("Available flowers for bouquets:");
        System.out.println(this.flowers);
    }
}
