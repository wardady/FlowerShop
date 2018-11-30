package config;

import flowers.Flower;
import flowers.FlowerBouquet;
import flowers.FlowerGroup;
import flowers.params.Color;
import flowers.params.Country;
import flowers.params.ExtraAttribute;
import flowers.params.FlowerType;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;

@ToString
@Getter
public class DefaultBouquets {
    private static DefaultBouquets myInstance = new DefaultBouquets();
    private ArrayList<FlowerBouquet> defaultBuckets;

    private DefaultBouquets() {
        ArrayList<ExtraAttribute> rose_attr = new ArrayList<>();
        rose_attr.add(ExtraAttribute.SPIKES);
        rose_attr.add(ExtraAttribute.PLEASANT_SMELL);
        Flower rose = new Flower(Color.RED, 20, 40, Country.UKRAINE, rose_attr, FlowerType.ROSIE);
        Flower chammomile = new Flower(Color.BLUE, 10, 20, Country.GREATBRITAN, new ArrayList<ExtraAttribute>(Collections.singletonList(ExtraAttribute.LUXURY)), FlowerType.CHAMOMILE);
        FlowerGroup roses = new FlowerGroup(rose, 20);
        FlowerGroup chammomiles = new FlowerGroup(chammomile, 15);
        this.defaultBuckets = new ArrayList<>();
        FlowerBouquet bucket = new FlowerBouquet();
        bucket.addFlower(chammomiles);
        bucket.addFlower(roses);
        defaultBuckets.add(bucket);
    }

    public static DefaultBouquets getInstance() {
        return myInstance;
    }
}

