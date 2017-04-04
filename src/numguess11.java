import java.util.Scanner;
import java.util.Random;

public class numguess11 {

    public static void main(String[] args) {
        while (true) {
            nrguess();
        }
    }

    public static void nrguess() {
        int random, guess, attempts;
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        random = generator.nextInt(10) + 1;
        attempts = 1;

        System.out.println("Ma gandesc la un numar intre 0 si 10, ghiceste care este numarul. Introdu 11 pentru a iesi.");
        System.out.print("Incearca: ");

        do {
            guess = keyboard.nextInt();
            if (guess == 11) {
                System.exit(0);
            }
            if (guess > random) {
                System.out.print("Mai mic: ");
                attempts += 1;
            }
            if (guess == random) {
                System.out.print("Felicitari, " + guess + " este numarul si ");
            }
            if (guess < random) {
                System.out.print("Mai mare: ");
                attempts += 1;
            }
        } while (guess != random);
        System.out.println("ati ghicit din a " + attempts + "-a incercare\n");
    }
}