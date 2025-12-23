package chapter2.exercises;
import java.util.Scanner;

public class ProblemFive {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        gratuityRate = gratuityRate / 100.0;
        double gratuity = subtotal * gratuityRate;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
