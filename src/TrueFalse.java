import java.util.Scanner;

public class TrueFalse
{
    public static void main(String[ ] args)
    {

        Scanner in = new Scanner(System.in);
        int[] a = {9,24};
        int key ;
        System.out.print("Introdu numarul: ");
        key = in.nextInt();
        int i ;

        boolean found = false;

        for ( i = 0; i < a.length; i++)
        {
            if (a[ i ]  == key)
            {
                found = true;
                break;
            }
        }

        if (found)
        {
            System.out.println("true  ai ghicit, numarul este in sir");
        }
        else
        {
            System.out.println("false  nu ai ghicit, numarul nu este in sir");
        }
    }
}