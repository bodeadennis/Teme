import java.util.Scanner;
import java.util.Random;

public class numguess{

    public static void main(String[] args) {

        int random, guess, attempts;
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        random = generator.nextInt(10) + 1;
        attempts = 1;

        System.out.println("Ma gandesc la un numar intre 0 si 10, ghiceste care este numarul.");
        System.out.print("Incearca: ");
        int nr=0;


        do {
            guess = keyboard.nextInt();
            nr++;
            if (guess > random) {
                System.out.print("Mai mic: ");
                attempts += 1;
            }

              if(guess==random) {
                  System.out.print("Felficitari, " +guess+ " este numarul si ");
            }
            if(guess < random){
                System.out.print("Mai mare: ");
            }
        } while (guess != random);
        System.out.println("ati ghicit din a-"+nr+" a incercare");

    }
}