
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        try
        {
            String name;
            int sub1,sub2,sub3;
            double avg = 0;
            System.out.println("Student name ? ");
            name = sc.nextLine();
            System.out.println("Subject 1 mark : ? ");
            sub1 = sc.nextInt();
            System.out.println("Subject 2 mark : ? ");
            sub2 = sc.nextInt();
            System.out.println("Subject 3 mark : ? ");
            sub3 = sc.nextInt();

            int[] marks = {sub1,sub2,sub3};
            avg = Calculate.calculateavg(marks);

            System.out.println("Student's result :  ");
            System.out.println("Name : " + name);
            System.out.println("Marks : " + marks[0] + " " + marks[1] + " " + marks[2] + " ");
            System.out.println("Average Marks : " + avg);

        }

        catch(NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }


        sc.close();
    }
}
