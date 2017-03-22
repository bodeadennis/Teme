import java.util.Scanner;
public class Tema3 {
    public static void main(String[] args) {

        System.out.print("Tasteaza numarul unei luni: ");

        int alege;
        Scanner in = new Scanner(System.in);
        alege = in.nextInt();


        String monthString;
        switch (alege) {
            case 1:  monthString = "Ianuarie";
                break;
            case 2:  monthString = "Februarie";
                break;
            case 3:  monthString = "Martie";
                break;
            case 4:  monthString = "Aprilie";
                break;
            case 5:  monthString = "Mai";
                break;
            case 6:  monthString = "Junie";
                break;
            case 7:  monthString = "Julie";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "Septembrie";
                break;
            case 10: monthString = "Octombrie";
                break;
            case 11: monthString = "Noiembrie";
                break;
            case 12: monthString = "Decembrie";
                break;
            default: monthString = "Luna invalida";
                break;
        }


        System.out.println(monthString);
    }
}