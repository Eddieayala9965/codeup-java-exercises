import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      scanner.useDelimiter("\n");
//
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately" + " %.2f%n", pi);
//        int userNum = scanner.nextInt(); // this does not like decimals
//        System.out.print("Please enter 3 words seperated by sapce");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();

//        System.out.printf("First word: %s%n, Second word: %s%n, third word %s%n", firstWord, secondWord, thirdWord);
//        System.out.println("Enter message");
//        String userSentence  = scanner.nextLine();
//        System.out.println(userSentence);


        System.out.println("enter length of room");
        String length = scanner.nextLine();
        String width = scanner.nextLine();

        int lengthAsInt = Integer.parseInt(length);
        int widthAsInt = Integer.parseInt(width);

        System.out.printf("Length: %s%n width: %s%n", lengthAsInt, widthAsInt);
        double areaOfroom = lengthAsInt * widthAsInt;
        double perimetrOfRoom = (2*lengthAsInt) + (2*widthAsInt);
        System.out.printf("Area of room: %.2f%nPerimeter of room: %.2f12", areaOfroom, perimetrOfRoom);











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


//        System.out.print("enter length and width: ");
//        int width = sc.nextInt();
//        int length = sc.nextInt();
//
//        int area = width * length;
//        int perimeter = width * 2 + length * 2;
//
//        System.out.printf("the area is: %s %n", area);
//        System.out.printf("the perimeter is: %s", perimeter);













    }
}
