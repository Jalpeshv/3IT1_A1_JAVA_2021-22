
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class packing_cupcakes
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n= s.nextInt();
            System.out.println(n/2 +1);
        }

    }
}