package ObjOrientedProgrammingPackage.AbstractClassesAndInterfaces;

import java.util.ArrayList;

public class Box implements ToBeStored {
    double maxWeight;
    double weight;
    ArrayList<Book> books;
    ArrayList<CD> cds;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.books = new ArrayList<Book>();
        this.cds = new ArrayList<CD>();
    }
    @Override
    public double weight() {
        return weight;
    }

    public void add(Book book) {
        if((this.maxWeight-this.weight) >= book.weight()) {
            books.add(book);
            this.weight = this.weight + book.weight();
        }
    }

    public void add(CD cd) {
        if((this.maxWeight-this.weight) >= cd.weight()) {
            cds.add(cd);
            this.weight = this.weight + cd.weight();
        }
    }

    public String toString() {
        return "Box: " + (this.books.size() + this.cds.size()) + " things, total weight " + this.weight;
    }
}
