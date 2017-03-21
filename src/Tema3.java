import java.util.Scanner;

public class Tema3 {

    public static void main(String[] args) {
        while (true) {
        int x;
        System.out.print("Introdu numarul lunii: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x < 1 || x > 12) {
            System.out.println("Nu sunt atatea luni intr-un an");}
        else if (x == 1)
            System.out.println("Ianuarie");
        else if (x == 2)
            System.out.println("Februarie");
        else if (x ==3)
            System.out.println("Martie");
        else if (x==4)
            System.out.println("Aprilie");
        else if (x==5)
            System.out.println("Mai");
        else if (x==6)
            System.out.println("Iunie");
        else if (x==7)
            System.out.println("Iulie");
        else if (x==8)
            System.out.println("August");
        else if (x==9)
            System.out.println("Septembrie");
        else if (x==10)
            System.out.println("Octombrie");
        else if (x==11)
            System.out.println("Noiembrie");
        else if (x==12)
            System.out.println("Decembrie");

    }
}
}