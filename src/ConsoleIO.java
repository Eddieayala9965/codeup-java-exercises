import java.util.Scanner;
public class ConsoleIO {
    public static void main(String[] args) {
//        String name = "Eddie";
//        System.out.printf("Hello, %s", name);
        Scanner sc = new Scanner(System.in);
System.out.println("What is your name");
String userName = sc.nextLine();
System.out.printf("Hello, %s",  userName);
long num = sc.nextLong();
System.out.println("enter number");
System.out.print(num);

    }
}
