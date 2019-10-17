package Week4.Robbery;

import java.util.ArrayList;
import java.util.List;

public class Inventory<E extends Item> {
    //Eigenschappen
    private List<E> items = new ArrayList<E>();

    //Constructors


    //Methodes
    public void add(E item) {
        items.add(item);
    }

    public List<E> getItems() {
        return items;
    }
}
