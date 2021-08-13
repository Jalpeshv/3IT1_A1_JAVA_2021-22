import java.util.Scanner;
public class Chef_and_Remissness {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
//        ENTER THE NO.OF TEST CASES
        int x=scan.nextInt();
        int[] max_array = new int[x];
        int[] min_array = new int[x];
        for (int i=0;i<x;i++)
        {
            int guard1 = scan.nextInt();
            int guard2 = scan.nextInt();
            max_array[i] = guard1 + guard2;
            min_array[i] = Math.max(guard1,guard2);
        }
        for (int i=0;i<x;i++)
        {
            System.out.println(min_array[i] + " " + max_array[i]);
        }
    }
}
