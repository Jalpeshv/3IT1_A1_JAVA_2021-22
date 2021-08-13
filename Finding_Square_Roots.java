import java.util.Scanner;
public class Finding_Square_Roots {

    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);

        int a=s.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=s.nextInt();
            int p=0;
            for(int j=0; j*j<=b; j++)
            {
                p=j;
            }
            System.out.println(p);
        }
    }
}
