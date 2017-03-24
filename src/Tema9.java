
import java.util.Scanner;

class Tema9

{
    public static void main(String args[])
    {
        int year;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti anu: ");
        year = in.nextInt();


        if ((year % 4 == 0) && year % 100 != 0)
        {
            System.out.println(year + " e un an bisect");
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
        {
            System.out.println(year + " e un an bisect");
        }
        else
        {
            System.out.println(year + " nu e un an bisect");
        }
    }
}