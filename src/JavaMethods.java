public class JavaMethods {
    public static void main(String[] args) {
        String myFirstName = "Rob";
        String myLastName = "Owens";
        printName(myFirstName, myLastName);
        printName(myFirstName);
    }
    public static void printName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
    public static void printName(String firstName) {
        System.out.println(firstName);
    }
}