
import java.util.Scanner;

public class Factorial {
    public static void main(String []args){
        Scanner MyConsole = new Scanner(System.in);

        System.out.print("Introduceti numarul pentru care se doreste calcularea factorialului: ");
        int a = MyConsole.nextInt();
        int fac = 1;
        int nr=0;


        for (nr=1 ;nr<=a ;nr++) {
            fac = fac * nr;
        }
        System.out.println(fac);


    }
}
