package Week4.London;

import Week4.Robbery.Item;

public class Attraction implements Item, Comparable<Attraction> {
    //Eigenschappen
    private String name;
    private double days;
    private int rating;

    //Constructor
    public Attraction (String name, double days, int rating){
        setName(name);
        setDays(days);
        setRating(rating);
    }

    //Methodes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDays(double days) {
        this.days = days;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Attraction attraction) {
        return Integer.compare(attraction.rating, rating);
    }

    @Override
    public double getWeight() {
        return days;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", name, days, rating);
    }
}
