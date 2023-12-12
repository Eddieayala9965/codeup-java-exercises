// Person.java

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + this.name);
    }

    public static void main(String[] args) {
        // Testing the Person class
        Person person = new Person("John");
        person.sayHello();
        System.out.println("Initial Name: " + person.getName());

        // Testing setName method
        person.setName("Jane");
        System.out.println("Updated Name: " + person.getName());
    }
}
