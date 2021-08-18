import java.util.*;
import java.lang.*;
import java.io.*;
public class find_reminder {
    public static void main(String[] args)throws java.lang.Exception

    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ans=a%b;
            System.out.println(ans);

        }
    }
}
