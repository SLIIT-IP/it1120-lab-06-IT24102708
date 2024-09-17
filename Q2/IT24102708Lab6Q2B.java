import java.util.Scanner;

public class IT24102708Lab6Q2B {
    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);

        System.out.println("Please enter 10 number:");

        int[] num = new int[10];

        int count = 0;
        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            num[count] = IN.nextInt();
            count++;
            
        }

        System.out.println();
        System.out.println("The number you entered are:");

        count = 0;
        while (count < 10) {
            System.out.print(num[count] + " ");
            count++;

        }
 
        IN.close();
    }
}