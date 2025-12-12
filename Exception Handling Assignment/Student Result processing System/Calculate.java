public class Calculate {
    
    public static double calculateavg(int[] marks) throws InvalidScore
    {
        if(marks.length!=3)
        {
            throw new ArrayIndexOutOfBoundsException("Should be 3 subjects");
        }
        int sum  = 0;
        for(int i=0;i<3;++i)
        {
            if(marks[i]<0)
            {
                throw new InvalidScore("Score cannot be smaller than 0 .");
            }
            if(marks[i]>100)
            {
                throw new InvalidScore("Score can't be greater than 100");
            }
            sum += marks[i];
        
        }

        return sum/3.0;

    }
}
