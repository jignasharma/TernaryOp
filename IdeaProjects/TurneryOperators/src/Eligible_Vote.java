import java.util.Scanner;

public class Eligible_Vote
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int  age = scanner.nextInt();//age is variable

        if (age >= 18){
            System.out.println("He or She eligible to vote");

        }
        else
            System.out.println("He or She Not eligible to vote");
    }


}




