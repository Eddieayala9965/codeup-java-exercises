package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.print("Enter yes or no: ");
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        int number;
        do {
            System.out.printf("Enter an integer between %d and %d: ", min, max);
            while (!scanner.hasNextInt()) {
                System.out.println("That's not an integer!");
                scanner.next();
            }
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number < min || number > max);

        return number;
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer!");
            scanner.next();
        }
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public double getDouble(double min, double max) {
        double number;
        do {
            System.out.printf("Enter a decimal number between %.2f and %.2f: ", min, max);
            while (!scanner.hasNextDouble()) {
                System.out.println("That's not a decimal number!");
                scanner.next();
            }
            number = scanner.nextDouble();
            scanner.nextLine();
        } while (number < min || number > max);

        return number;
    }

    public double getDouble() {
        System.out.print("Enter a decimal number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("That's not a decimal number!");
            scanner.next();
        }
        double number = scanner.nextDouble();
        scanner.nextLine();
        return number;
    }


    public void close() {
        scanner.close();
    }
}

