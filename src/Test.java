
public class Test {
    public static void main(String []args){

        int t=4;
        int n=10;
        int[] sirNr ={3,11,13,9,8,16,20,1,4,7,10,6,0};



        System.out.println("Numerele intre "+t+" si "+n+" sunt: ");

        for(int i=0 ; i < sirNr.length - 1 ;i++ ){
            int x=sirNr[i];


            if (x>=t && x<=n)

                System.out.println(x);

    }
    }
}
