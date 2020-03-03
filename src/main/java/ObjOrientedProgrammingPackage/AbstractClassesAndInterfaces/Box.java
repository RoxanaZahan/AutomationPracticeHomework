package ObjOrientedProgrammingPackage.AbstractClassesAndInterfaces;

import java.util.ArrayList;

public abstract class Box {
    double maxWeight;
    double weight;
    ArrayList<Book> books;
    ArrayList<CD> cds;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.books = new ArrayList<Book>();
        this.cds = new ArrayList<CD>();
    }

    public double getWeight() {
        return this.weight;
    }

    public double getMaxWeight() {
        return this.maxWeight;
    }

    public abstract void add(Book book);

    public abstract void add(CD cd);

    public abstract String toString();
}
