import java.util.Scanner;

public class Packaging_Cupcakes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the no. of test cases");
        int x = scan.nextInt();
        int[] array = new int[x];
        for (int i=0;i<x;i++)
        {
//         ENTER THE NO.OF PANCAKES
            int temp = scan.nextInt();
            array[i] = (temp/2) + 1;
        }
        for (int i=0;i<x;i++)
        {
            System.out.println(array[i]);
        }
    }
}
