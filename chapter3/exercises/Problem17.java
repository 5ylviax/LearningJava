package chapter3.exercises;
import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number = (int) (Math.random() * 3);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int userResponse =  input.nextInt();

        if((userResponse != 0) && (userResponse != 1) && (userResponse != 2))
        {
            System.out.println("Your input is invalid.");
        }
        else
        {
            switch (number) {
            case 0:
                // scissor
                if(userResponse == number)
                {
                    System.out.println("The computer is scissor. You are scissor too. It is a draw");
                }
                else if(userResponse == 1)
                {
                    System.out.println("The computer is scissor. You are rock. You won");
                }
                else 
                {
                    System.out.println("The computer is scissor. You are paper. You lost");
                }
                break;
            case 1:
                // rock
                if(userResponse == number)
                {
                    System.out.println("The computer is rock. You are rock too. It is a draw"); 
                }
                else if(userResponse == 2)
                {
                    System.out.println("The computer is rock. You are paper. You won");
                }
                else
                {
                    System.out.println("The computer is rock. You are scissor. You lost");
                }
                break;
            case 2:
                // paper 
                if(userResponse == number)
                {
                    System.out.println("The computer is paper. You are paper too. It is a draw");
                }
                else if(userResponse == 0)
                {
                    System.out.println("The computer is paper. You are scissor. You won");
                }
                else 
                {
                    System.out.println("The computer is paper. You are rock. You lost");
                }
                break;
            default:
                break;
        }
        }
        input.close();
    }
}
