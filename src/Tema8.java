import java.util.Scanner;

class Tema8
{
    public static void main(String args[])
    {
        int n,x, c;
        System.out.print("Introduce numarul pe care il vom multiplica: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.print("Introdu al doilea numar: ");
        x = in.nextInt();


        System.out.println("Tabla inmultirii dintre si cu numerele " +n+" "+x+" este: ");
        for (c = 0; c <= 10; c++)

        System.out.println(n + "*" + c + " = " + (n * c));
        int intre = n;

        while(intre < x ) {
            intre++;
            for (c = 0; c <= 10; c++)
                System.out.println(intre + "*" + c + " = " + (intre * c));
        }

        for (c = 0; c <= 10; c++)
            System.out.println(x + "*" + c + " = " + (x * c));

        }
    }
