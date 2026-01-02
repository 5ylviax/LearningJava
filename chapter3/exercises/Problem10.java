package chapter3.exercises;
import java.util.Scanner;

/*
(Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a 
subtraction question. Revise the program to randomly generate an addition ques
tion with two integers less than 100.
 */
public class Problem10 {
    public static void main(String[] args)
    {
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        System.out.print("What is " + number1 + " + " + number2 + " ?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if(answer == (number1 + number2))
        {
            System.out.println("You are correct!");
        }
        else 
        {
            System.out.print("Your ansewr is wrong");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
        }
        input.close();
    }
}
