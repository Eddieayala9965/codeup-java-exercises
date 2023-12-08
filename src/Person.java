class Person {
    public String firstName;
    public String lastName;

    public String getName() {
        return String.format("Hello ", firstName, lastName);
    }

    public static void main(String[] args) {
        Person eddie = new Person();
        eddie.firstName = "Eddie";
        eddie.lastName = "Ayala";
        System.out.println(eddie.getName());

    }
}
