import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner Sc = new Scanner(System.in);

        // Get the total nos
        int t = Sc.nextInt();

        for (int i=0; i<t; i++){
            int A = Sc.nextInt();
            int B = Sc.nextInt();
            int C = Sc.nextInt();

            if(A>B && A<C || A<B && A>C){
                System.out.println(A);
            }
            else if(B>A && B<C || B<A && B>C){
                System.out.println(B);
            }
            else{
                System.out.println(C);
            }
        }
	}
}
