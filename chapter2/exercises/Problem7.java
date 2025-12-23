package chapter2.exercises;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int number = input.nextInt();
        int hours = number / 60;
        int days = hours / 24;
        int years = days / 365;
        int remainder = days % 365;

        System.out.println("1000000000 minutes is approximately " + years + " years and " + remainder + " days");
    }
}
