public class GameSystem {
    public static void main(String[] args) {
        Warrior argon = new Warrior("Aragon", 1, 0);
        argon.attack(40);
        argon.defend();
        argon.attack(150);
        argon.attack(200);
        System.out.println("Final Stats: ");
        argon.showStats();
    }
    
}
