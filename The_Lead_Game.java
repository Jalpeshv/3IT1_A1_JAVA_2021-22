import java.util.*;
import java.lang.*;
public class The_Lead_Game {
        public static void main (String[] args) throws java.lang.Exception
        {
            // System.out.println("enter how many rounds");
            int lead=0;
            int winner=1;
            int temp=0;
            int first=0;
            int second=0;

            Scanner sc=new Scanner(System.in);
            int rounds=sc.nextInt();
            for(int i=0;i<rounds;i++)
            {
                first+=sc.nextInt();
                second+=sc.nextInt();

                if(first>second)
                {
                    temp=first-second;
                    if(temp>lead)
                    {
                        lead=temp;
                        winner=1;
                    }
                }
                else
                {
                    temp=second-first;
                    if(temp>lead)
                    {
                        lead=temp;
                        winner=2;
                    }
                }
            }
            System.out.println(winner + " " + lead);
        }
}
