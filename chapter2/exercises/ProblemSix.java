package chapter2.exercises;
import java.util.Scanner;

public class ProblemSix {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int sum1 = number % 10;

        number = number / 10;

        int sum2 = number % 10;
        number = number / 10;

        int sum3 = number % 10;

        int sum = sum1 + sum2 + sum3;
        
        System.out.println("The sum of the digits is "  + sum);
    }
}
