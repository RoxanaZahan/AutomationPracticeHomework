package ObjOrientedProgrammingPackage.AbstractClassesAndInterfaces;

public class Main {
    public static void main(String[] args) {
        BigBox box1 = new BigBox(10); //customisable box.
        BigBox box2 = new BigBox(); //this has a default capacity of 20kg.

        box1.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box2.add( new Book("Robert Martin", "Clean Code", 1) );
        box2.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box1.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box1.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box1.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println(box1.toString());
        System.out.println(box2.toString());
    }
}
