package rpg;

public class Fighter {
    public String name;
    public int hp;
    public Fighter(String name){
        this.name = name;
        this.hp = 100;
    }
    public void shout() {
        System.out.println(this.name + " let out a loud shout!");
    }
    public void attack(Fighter opponent){
        System.out.println(this.name + " attacked " + opponent.name + " for 10pts of dmg ");
        opponent.hp -= 10;
        System.out.println(opponent.name + "'s HP is now: " + opponent.hp);

    }
}
