import java.util.Scanner;

public class IT24102708Lab6Q3 {
    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);

        System.out.println("Enter positive integers (terminate input with -99):");

		int count = 0;
		int total = 0;

		while (true) {    
			System.out.print("Enter a number:");
			int num = IN.nextInt();

			if (num == -99) {
				break;
			} else if (num < 0) {
				System.out.println("Invalid input. Please enter a positive interger or -99 to terminate.");
				continue;
			} else {
				total += (num*num);
				count++;
			}
		}

        double RMS = Math.sqrt(total/count);
        System.out.println();
        System.out.println("The Root Mean Square (RMS) is: " + RMS);

        IN.close();

    }
}