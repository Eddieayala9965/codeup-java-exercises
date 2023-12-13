import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ServerNameGenerator {

    public static String randomWord(String[] array) {
        int randomNumber = (int)(Math.random() * array.length);
        return array[randomNumber];
    }

    public static void main(String[] args) {



        String[] adjectives = {
                "beautiful", "creative", "energetic", "friendly", "innovative",
                "joyful", "magnificent", "powerful", "vibrant", "witty"
        };



        String[] nouns = {
                "sunshine", "mountain", "ocean", "adventure", "dream",
                "harmony", "journey", "sunset", "laughter", "serenity"
        };

        String myAdj = randomWord(adjectives);
        String myNoun = randomWord(nouns);

        System.out.println("intened output " + myAdj + "-" + myNoun);








    }
}
