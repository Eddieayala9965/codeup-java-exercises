import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately" + " %.2f%n", pi);
        Scanner sc = new Scanner(System.in);
//        int num = 900;
//        System.out.println("enter number");
//        num = sc.nextInt();
// code throws an error if you enter a string or letter
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//        System.out.println("enter words");
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);
//        System.out.println("Enter Sentence");
//        String sentence = sc.nextLine();


        System.out.print("enter length and width: ");
        int width = sc.nextInt();
        int length = sc.nextInt();

        int area = width * length;
        int perimeter = width * 2 + length * 2;

        System.out.printf("the area is: %s %n", area);
        System.out.printf("the perimeter is: %s", perimeter);











    }
}
