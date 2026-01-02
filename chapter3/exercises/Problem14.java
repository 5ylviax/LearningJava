package chapter3.exercises;
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Head (0) or Tails (1)?: ");
        int guess = input.nextInt();

        int number = (int) (Math.random() * 1);

        if(guess == number)
        {
            System.out.println("You are correct!");
        }
        else 
        {
            System.out.println("You are wrong.");
        }
        input.close();
    }
}
