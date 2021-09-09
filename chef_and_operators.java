import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int t,a,b;
        t=sc.nextInt();
        if(t>=1 && t<=10000){
            for(int i=0;i<t;i++){
                a=sc.nextInt();
                b=sc.nextInt();
                if(a>=1 && b>=1 && a<=1000000001 && b<=1000000001){
                    if(a>b){
                        System.out.println(">");
                    }
                    if(a<b){
                        System.out.println("<");
                    }
                    if(a==b){
                        System.out.println("=");
                    }
                }
            }
        }
	}
}
