package chapter2.noteCode;
import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //prompt the user for input 
        System.out.print("Enter a integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60; // Find minutes in seconds
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }  
}
