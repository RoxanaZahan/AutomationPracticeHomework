package ObjOrientedProgrammingPackage.InheritanceOverritingPolymorphism;

public class Main {
    public static void main(String[] args) {
//        Create a class called Person with the following properties: firstName, lastName, address, city, country, birthDate.
//        By printing the object you can print their full name and their birth date.
//        Create a subclass of the Person class, called Employee. The employee has a salary.
//        By printing the object you can also print their salary in addition to what’s printed for a person.
//        Create a subclass of Employee, called PartTimeEmployee. The part time employee’s salary is -25% of the full time employee’s.
//        In another class, create the main method that will create each type of employees and print them.

        Employee employee = new Employee("Joe", "Briggs", "02.06.1991", 12345);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane", "Priest", "02.06.1991", 12);

        System.out.println("\nEmployee's name is: " + employee.getName());
        System.out.println("Employee's birth date is: " + employee.getBirthDate());
        System.out.println("Employee's salary is: " + employee.getSalary());

        System.out.println("\nEmployee's name is: " + partTimeEmployee.getName());
        System.out.println("Employee's birth date is: " + partTimeEmployee.getBirthDate());
        System.out.println("Employee's salary is: " + partTimeEmployee.getSalary() );
    }
}
