import java.util.Scanner;

public class IT24102708Lab6Q1 {

    public static void main(String[] args) {

        Scanner IN = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = IN.nextDouble();

        System.out.println();
        System.out.println("The square of " + num + " is : " + num*num);
        System.out.println("The square root of " + num + " is : " + Math.sqrt(num));

        IN.close();
    }
}