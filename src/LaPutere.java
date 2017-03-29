
import java.util.Scanner;

public class LaPutere {
    public static void main(String []args){
        Scanner MyConsole = new Scanner(System.in);
       System.out.print("Introdu numarul care va fi inmultit: ");
       int a = MyConsole.nextInt();
       System.out.print("De cate ori va fi inumtit numarul cu el insusi: ");
       int n = MyConsole.nextInt();
       int c = a;


       for (int i=0 ;i<n-1 ;i++) {
           c = a * c;


       }

        System.out.println(c);

    }
}
