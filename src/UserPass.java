import java.util.Scanner;
import java.io.IOException;

public class UserPass {

    // db
    static String user = "mihai";
    static String parola = "password1";


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Log in  ");
        boolean nimerit = false;
        while (!nimerit) {

            System.out.print("username: ");
            String u = input.next();

            System.out.print("password: ");
            String p = input.next();


            nimerit = isCombinatiaBuna(u, p);
            if (nimerit) {
                lansez();
            }
        }
    }



    public static void lansez() {
        System.out.println("You are loggin");
        try {
            ProcessBuilder pb = new ProcessBuilder("Notepad.exe");
            pb.start();
        } catch (IOException e) {
        }
    }


    public static boolean isCombinatiaBuna(String userTst, String parolaTst) {

        // return true daca is alea din db altfel false
        if (userTst.equals(user) & parolaTst.equals(parola)) {
            return true;
        }
        return false;
    }
}