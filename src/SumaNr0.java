import java.util.Scanner;

public class SumaNr0
{
    public static void main(String[] args)
    {
        Scanner MyConsole = new Scanner(System.in);

        int number;
        int sum=0;


        do
        {
            System.out.print("Enter a number: ");
            number = MyConsole.nextInt();

            if (number > 4 && number<11)
               sum=sum+number;


        }
        while(number != 0);
          System.out.println(sum);
    }
}