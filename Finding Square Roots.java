/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for(int i=0;i<T;i++)
		arr[i] = sc.nextInt();
		for(int j=0;j<T;j++){
		      int i = 1;
		      while(true){
		            if(i*i <= arr[j] && (i+1)*(i+1)>arr[j])
		            {
		                  System.out.println(i);
		                  break;
		            }
		            else 
		            i++;
		      }
		}
	
	}
}
