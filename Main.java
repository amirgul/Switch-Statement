import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a grade and program will give you equivalent number");
        char grade = keyboard.next().charAt(0);
        switch (grade)
        {
            case 'A':
                System.out.println(4.0);
                break;
            case 'B':
                System.out.println(3.0);
                break;
            case 'C':
                System.out.println(2.0);
                break;
            case 'D':
                System.out.println(1.0);
                break;
                default:
                    System.out.println("wrong parameter entered: " + 0.0);


        }

    }
}
