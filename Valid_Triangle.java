import java.util.Scanner;
public class Valid_Triangle {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0 ; i<a; i++)
        {
            int b=s.nextInt();
            int c=s.nextInt();
            int d=s.nextInt();

            int sum= b+c+d;
            if(sum==180)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }

}
