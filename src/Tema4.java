import java.util.Scanner;

class Tema4
{
    public static void main(String args[])
    {
        int n, c;
        System.out.print("Introduce numarul pe care il vom multiplica: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Tabla inmultirii cu "+n+" este: ");

        for ( c = 0 ; c <= 10 ; c++ )
            System.out.println(n+"*"+c+" = "+(n*c));
    }
}