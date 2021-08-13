import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many lines");
        int x = scan.nextInt();
        int[] my_array = new int[3];
        int[] output_array = new int[x];
        for (int i=0;i<x;i++)
        {
            my_array[0] = scan.nextInt();
            my_array[1] = scan.nextInt();
            my_array[2] = scan.nextInt();
            Arrays.sort(my_array);
            output_array[i] = my_array[1];
        }

        for (int i=0;i<x;i++)
        {
            System.out.println(output_array[i]);
        }
    }
}
