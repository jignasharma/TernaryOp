import java.util.Scanner;

public class OddEvenNumbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int num = scanner.nextInt();

        String result = (num %2 == 0) ? "Even" : "Odd" ;
        System.out.println("Number is :"+result);


    }

}
