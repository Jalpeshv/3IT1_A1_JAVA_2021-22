import java.util.Scanner;
public class Small_Factorial {


    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        for(int i = 0; i < t; i++){
            int n = x.nextInt();
            int sum=1;
            for(int j=n;j>0;j--)
            {
                sum*=j;
            }
            System.out.println(sum);
        }
    }
}
