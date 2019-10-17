package Week4.Robbery;
public class Product implements Item, Comparable<Product> {
    //Eigenschappen
    private String name;
    private double weight;
    private double price;

    //Constructor
    public Product(String name, double weight, double price) {
        setName(name);
        setWeight(weight);
        setPrice(price);
    }

    //Methodes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s € %.2f %.2f KG", name, price, weight);
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public int compareTo(Product p) {
        return Double.compare(p.price, price);
    }
}
