import java.util.Scanner;
public class Chef_and_Remissness {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=s.nextInt();
            int c=s.nextInt();
            int sum=b+c;
            if(b>=c)
            {
                System.out.println(b+" "+sum);
            }
            else
            {
                System.out.println(c+" "+sum);
            }

        }
    }
}
