public class Warrior extends GameCharacter {

    public Warrior(String name, int level,int experience)
    {
        super(name, level, experience);
        System.out.println("Character Created: " + name);
        showStats();
    }
    @Override
    public void attack(int z)
    {
        System.out.println(name + " attacks with a sword!");
        gainExperience(z);
        System.out.println("Exp gained : " + z);
    }
    
    @Override
    public void defend()
    {
        System.out.println(name + " " + " defends with a sheild!");
    }
}
