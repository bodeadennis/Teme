
import java.util.Scanner;

class Tema1
{
    public static void main(String args[])
    {
        int x, y;
        System.out.print("Pune doua numere pentru a le compara: ");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();


        if ( x > y )
            System.out.println("Numarul "+ x +" este mai mare decat numarul "+y);
        else if ( y > x )
            System.out.println("Numarul "+ y +" este mai mare decat numarul "+x);
        else if ( y == x )
            System.out.print ("Numerele introduse " + x + " si "+ y+" sunt egale");

    }
}