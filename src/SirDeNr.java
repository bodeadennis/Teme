public class SirDeNr
{
    public static void main(String[ ] args)
    {
        int[] a = {1,3,4,6,7,8,10,12,14,23};
        int key = 4;

        int i = 0;
        boolean found = false;

        for ( i = 0; i < a.length; i++)
        {
            if (a[ i ]  == key)
            {
                found = true;
                break;
            }
        }

        if (found)
        {
            System.out.println("Found " + key + " at index " + i + ".");
        }
        else
        {
            System.out.println(key + " is not in this array.");
        }
    }
}