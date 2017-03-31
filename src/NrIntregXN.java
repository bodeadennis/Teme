import java.util.Scanner;
public class NrIntregXN {
    public static void main(String []args){
        Scanner MyConsole = new Scanner(System.in);
        System.out.print("Introdu primul numar: ");
        int x =MyConsole.nextInt();
        System.out.print("Introdu al doilea numar: ");
        int n =MyConsole.nextInt();

        int suma=1;
        int asc=1;


        for(int i=1;i<=n;i++){
            asc = asc * x;
            suma = suma + asc;

        }
           System.out.print("Rezultatul este: "+suma);

    }
}
