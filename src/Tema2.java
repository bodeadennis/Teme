
import java.util.Scanner;

class Tema2
{
    public static void main(String args[])
    {
        while (true) {
        int x, y, z;
        System.out.print("Scrie 3 numere diferite si ti-l voi arata pe cel mai mic: ");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();


        if (x == y && y == z)
            System.out.println("Numerele introduse " + x + " " + y + " " + z + " sunt egale");
        else if (x < y && x < z)
            System.out.println("Cel mai mic dintre numerele introduse este numarul: " + x);
        else if (y < x && y < z)
            System.out.println("Cel mai mic dintre numerele introduse este numarul: " + y);
        else if (z < x && z < y)
            System.out.println("Cel mai mic dintre numerele introduse este numarul: " + z);

    }

    }
}


