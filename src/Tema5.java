import java.util.Scanner;

class Tema5
{
    public static void main(String args[]){

        double lbs, kg;
        System.out.print("Introduce greutatea in LBS: ");
        Scanner in = new Scanner(System.in);
        lbs = in.nextInt();

        kg=0.45359*lbs;
        System.out.print("Echivalentul a "+lbs+" LBS e "+kg+" KG.");

    }
}
























