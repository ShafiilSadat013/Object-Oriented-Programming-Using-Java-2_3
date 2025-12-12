public abstract class GameCharacter implements CharacterActions {

    protected String name;
    protected int level;
    protected int experience;

    public GameCharacter(String name,int level ,int experience)
    {
        this.name = name;
        this.level = level;
        this.experience = experience;
    }

    public void showStats()
    {
        System.out.println("Name : " + name + "| level : " + level + "| Experience : " + experience);

    }

    @Override
    public void gainExperience(int points)
    {
        experience+=points;
        if(experience>=100)
        {
            experience-=100;
            level++;
            System.out.println("Level up " + name + " | current level :" + level);
        }
    
    }

    public abstract void attack(int eG);
    public abstract void defend();

       
}
