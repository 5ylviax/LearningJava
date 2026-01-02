package chapter3.exercises;
import java.util.Scanner;
/*
(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three
digit number. The program prompts the user to enter a three-digit number and 
determines whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is 
$10,000.
2. If all digits in the user input match all digits in the lottery number, the award is 
$3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is 
$1,000.
*/
public class Problem15 {
    public static void main(String[] args)
    {
        int lottery = (int) (Math.random() * 100);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;
            
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if(guess == lottery)
        {
            System.out.println("Exact match: you win $100,000");
        }
        else if(guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
        {
            System.out.println("Match all digits: you win: yyou win $10,000");
        }
        else if (guessDigit1 == lotteryDigit1
            || guessDigit1 == lotteryDigit2
            || guessDigit2 == lotteryDigit1
            || guessDigit2 == lotteryDigit2)
        {
            System.out.println("Match one digit: you win $1,000");
        }
        else 
        {
            System.out.println("Sorry, no match");
        }
         input.close();
    }
}
