package Week4.Robbery;

import java.util.ArrayList;
import java.util.List;

public class Knapsack<E extends Item> {
    //Eigenschappen
    private double maximumCapacity;
    private List<E> items = new ArrayList<E>(); //=NEW ARRAYLIST NIET VERGETEN!!!!!!!!

    //Constructors
    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    //Methodes
    public void add(E item) throws KnapsackFullException {
        if (getCurrentWeight() + item.getWeight() <= maximumCapacity) {
            items.add(item);
        } else {
            throw new KnapsackFullException("Item not allowed");
        }
    }

    public double getCurrentWeight() {
        int currentCapacity = 0;
        for (E item : items) {
            currentCapacity += item.getWeight();
        }
        return currentCapacity;
    }

    public List<E> getItems() {
        return items;
    }
}
