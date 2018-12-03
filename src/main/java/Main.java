import flowers.Flower;
import flowers.FlowerBouquet;
import flowers.params.Color;
import flowers.params.Country;
import flowers.params.ExtraAttribute;
import flowers.params.FlowerType;
import payment_methods.CardPayment;
import payment_methods.Payment;
import payment_methods.PaymentContext;
import shopping_carts.Cart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<ExtraAttribute> rose_attr = new ArrayList<>();
        rose_attr.add(ExtraAttribute.SPIKES);
        rose_attr.add(ExtraAttribute.PLEASANT_SMELL);
        Flower flower1 = new Flower(Color.RED, 20, 40, Country.UKRAINE, rose_attr,
                FlowerType.ROSIE);
        Flower flower2 = new Flower(Color.BLUE, 35, 40, Country.HOLAND, rose_attr,
                FlowerType.ROSIE);
        Flower flower3 = new Flower(Color.GREEN, 15, 25, Country.GREATBRITAN,
                new ArrayList<ExtraAttribute>(), FlowerType.CHAMOMILE);
        Flower flower4 = new Flower(Color.BLUE, 25, 30, Country.HOLAND,
                new ArrayList<ExtraAttribute>(Collections.singletonList(ExtraAttribute.LUXURY)), FlowerType.TULIP);
        ArrayList<Flower> available_flowers = new ArrayList<>(Arrays.asList(flower1, flower2, flower3, flower4));
        FlowerShop flowerShop = new FlowerShop(available_flowers);
        flowerShop.promo();
        Cart myCart = flowerShop.createCart("20");
        myCart.addBouquet(flowerShop.getBouquets().get(0));
        myCart.getPrice();
        HashMap<Integer,Integer> custom_flowers= new HashMap<>();
        for (int i = 0; i < 4; i++) {
            custom_flowers.put(i,(i+1)*2);
        }
        FlowerBouquet myBouquete = flowerShop.createBouquete(custom_flowers);
        myCart.addBouquet(myBouquete);
        System.out.println("You have to pay\t"+myCart.getPrice()+" UAH");
        Payment payment = new CardPayment();
        double balance = 200;
        ArrayList<FlowerBouquet> owned = flowerShop.buyCart(myCart,payment,balance);
        System.out.println("Your bouquets:");
        for(FlowerBouquet fb:owned){
            System.out.println(fb);
        }

    }
}
