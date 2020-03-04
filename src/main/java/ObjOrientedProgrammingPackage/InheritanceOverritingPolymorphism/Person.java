package ObjOrientedProgrammingPackage.InheritanceOverritingPolymorphism;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String country;
    private String birthDate;

    public Person (String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
