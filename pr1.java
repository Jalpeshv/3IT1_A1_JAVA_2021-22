import java.util.*;
public class pr1
{
    public static void main(String args[])

    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++)
        {
            int z = scan.nextInt();
            int sum = 0;
            while(z>0)
            {
                int rev;

                rev = z % 10;
                sum = sum + rev;
                z = z/10;


            }
            System.out.println(sum);
        }
    }
}
