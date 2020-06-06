import java.util.Scanner;

public class Positive_Negative
{
    public static void main(String[] args)
    {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");// this program check if a given
        // integer is Positive or Negative.
        num = scanner.nextInt();

        if (num > 0){
            System.out.println("The given number "+num+" is Positive");

        }
        else if (num < 0){
            System.out.println("The given number "+num+" is negative");

        }



    }
}
