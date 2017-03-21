import java.util.Scanner;

class Tema6 {
    public static void main(String args[]) {
        double fr, cel;

        System.out.print("Introduce temperatura in Fahrenheit: ");
        Scanner in = new Scanner(System.in);
        fr = in.nextInt();


        cel = (fr - 32) * 5 / 9;
        System.out.print("Echivalentul a " + fr + " grade Fahrenheit e " + cel + " grade Celsius.");
    }
}

