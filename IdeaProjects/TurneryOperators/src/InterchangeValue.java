import java.util.Scanner;

public class InterchangeValue
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");//program to swap two integers
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();

        int temp = 0;//create variable (temp)
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swaping ::");
        System.out.println("Value of first number :: " +num1);
        System.out.println("Value of first number :: " +num2);
    }

}
