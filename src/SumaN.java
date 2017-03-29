import java.util.Scanner;


public class SumaN {
    public static void main(String []args){


        System.out.print("Introdu numarul: ");
        Scanner MyConsole = new Scanner(System.in);
        int n;
        n = MyConsole.nextInt();
        int sum=0;

        for (int i=1; i<=n;i++)
            sum=sum+i;

      System.out.println(sum);



    }
}
