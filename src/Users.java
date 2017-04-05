import java.util.Scanner;
import java.io.IOException;

public class Users {

    static User[] users  = new User[]{
            new User("Mihai", "123"),
            new User("Denis", "234"),
            new User("Victor", "345"),
            new User("Raul", "456")
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Log in  ");
        boolean nimerit = false;
        while (!nimerit) {

            // incearca
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

        for(int i = 0; i < users.length; i++)
            if (userTst.equals(users[i].getUsername()) & parolaTst.equals(users[i].getPassword())) {
                return true;
            }
        return false;
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
