package chapter02;

// Listing 6 Using the Person class from Java

public class Listing06 {

    public static void main(String[] args) {
        Person1 person = new Person1("Bob", true);
        System.out.println(person.getName());
        System.out.println(person.isMarried());
        person.setMarried(false);
        System.out.println(person.isMarried());
    }
}
