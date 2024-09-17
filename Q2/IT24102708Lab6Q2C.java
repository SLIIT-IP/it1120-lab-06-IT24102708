import java.util.Scanner;

public class IT24102708Lab6Q2C {
    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");

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
        int sum = 0;
        while (count < 10) {
            System.out.print(num[count] + " ");
            sum = sum + num[count];
            count++;

        }

        double avg = sum/10;

        System.out.println("\n");
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the number: " + avg);
 
        IN.close();
    }
}