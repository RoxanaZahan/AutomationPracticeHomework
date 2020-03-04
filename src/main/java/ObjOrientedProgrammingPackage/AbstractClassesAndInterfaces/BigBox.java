package ObjOrientedProgrammingPackage.AbstractClassesAndInterfaces;

import java.util.ArrayList;

public class BigBox extends Box {

    public BigBox(double maxWeight) {
        super(maxWeight);
    }
    public BigBox() {
        super(20);
        super.books = new ArrayList<Book>();
        super.cds = new ArrayList<CD>();
    }
    @Override
    public double getWeight() {
        return super.weight;
    }

    public double getMaxWeight() {
        return super.maxWeight;
    }

    public void add(Book book) {
        if((getMaxWeight()-super.weight) >= book.weight()) {
            super.books.add(book);
            super.weight = super.weight + book.weight();
        }
    }

    public void add(CD cd) {
        if((getMaxWeight()-super.weight) >= cd.weight()) {
            super.cds.add(cd);
            super.weight = super.weight + cd.weight();
        }
    }

    public String toString() {
        return "Box: " + (super.books.size() + super.cds.size()) + " things, total weight " + super.weight;
    }
}
