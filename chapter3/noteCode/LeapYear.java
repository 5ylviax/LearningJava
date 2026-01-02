package chapter3.noteCode;
import java.util.Scanner;

public class LeapYear {
    // A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400.
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + " is a leap year? " + isLeapYear);
         input.close();
    }
}
