package rpg;

public class rpgApplication {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Ryu");
        fighter1.shout();
        Fighter fighter2 = new Fighter("Dantes");
        fighter2.shout();;

        fighter1.attack(fighter2);
    }
}
