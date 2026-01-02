package chapter3.exercises;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int number1 = number % 1000 / 100;
        int number2 = number % 100 / 10;
        int number3 = number % 10;

        // System.out.println(number1);
        // System.out.println(number2);
        // System.out.println(number3);

        if(number1 == number3)
        {
            System.out.println( number + " is a palindrome");
        }
        else 
        {
            System.out.println(number + " is not a palindrome");
        }
    }
}
