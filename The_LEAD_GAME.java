import java.util.Scanner;

class The_LEAD_GAME {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num_of_round = sc.nextInt();
        int player1count=0 , player2count=0 ;
        int player1[] = new int[10000];
        int player2[] = new int[10000];

        int cumplayer1=0 , cumplayer2 =0 ;

        int lead1[] = new int[10000];
        int lead2[] = new int[10000];
        for(int i =0 ; i<num_of_round ; i++)
        {
            player1[i] = sc.nextInt();
            player2[i] = sc.nextInt();

            cumplayer1=cumplayer1 + player1[i] ;
            cumplayer2=cumplayer2 + player2[i] ;

            if(cumplayer1 > cumplayer2 )
            {
                lead1[i]= cumplayer1 - cumplayer2 ;
                lead2[i]=0 ;
            }
            else
            {
                lead2[i]=cumplayer2 - cumplayer1 ;
                lead1[i]=0 ;
            }
        }
        int max = lead1[0];
        int max1 = lead2[0];
        for(int i =1 ; i<num_of_round ;i++)
        {
            if(lead1[i]>max)
            {
                max=lead1[i];
                int flag =1 ;
            }
            if(lead2[i]>max1)
            {
                max1=lead2[i];
                int flag=2 ;
            }
        }
        if(max>max1)
        {
            System.out.println("1 "+max);
        }
        else
        {
            System.out.println("2 "+max1);
        }
    }
}
