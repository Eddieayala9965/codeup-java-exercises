package util;


import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();


        System.out.println("String entered: " + input.getString());


        System.out.println("User said yes: " + input.yesNo());


        int userInt = input.getInt(1, 10);
        System.out.println("User entered integer: " + userInt);


        int anotherInt = input.getInt();
        System.out.println("User entered another integer: " + anotherInt);


        double userDouble = input.getDouble(1.0, 5.0);
        System.out.println("User entered decimal number: " + userDouble);


        double anotherDouble = input.getDouble();
        System.out.println("User entered another decimal number: " + anotherDouble);


        input.close();
    }
}
