import java.util.Scanner;

class Tema7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        double kg;
        System.out.print("Introduceti kilogramele dumneavoastra: ");
        kg = in.nextDouble();

        double height;
        System.out.print("Introduceti inaltimea dumneavoastra in metri: ");
        height = in.nextDouble();


        double BMI;
        BMI = kg / (height*height);


        if ( BMI< 19 )
            System.out.println("Sunteti subnutrit, consultati un medic.");
        else if ( BMI >= 19 && BMI < 24.9 )
            System.out.println("Greutatea dumneavoastra este optima, tineti-o tot asa.");
        else if ( BMI >= 25 && BMI < 29.9 )
            System.out.println("Sunteti putin peste greutatea optima.");
        else if ( BMI >= 30 && BMI < 34.9 )
            System.out.println("Va incadrati in primul nivel de obezitate");
        else if ( BMI >= 35 && BMI < 39.9 )
            System.out.println("Va incadrati in nivelul 2 de obezitate");
        else if ( BMI >= 40 && BMI < 60 )
            System.out.println("Va incadrati in nivelul 3 de obezitate");
        else if ( BMI >60 )
            System.out.println("Ati introdus cifre eronate, mai incercati odata");


    }

}