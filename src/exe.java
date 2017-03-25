

public class exe{

    public static void main(String[]args){


        String s;
        s = SkeletonJava.readStringConsole("Introduceti stringul");
        System.out.println(s.toUpperCase());



        String cale="c:\temp.txt\tt\fisier.txt";


        int delacat=cale.lastIndexOf(".");
        String extensie =cale.substring(delacat);
        System.out.println(extensie);



    }
}