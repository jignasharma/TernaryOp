import java.util.Scanner;

public class Symbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number:"); //two variables to hold numbers
        int num1 = scanner.nextInt();
        System.out.println("Input the second number:");
        int num2 = scanner.nextInt();
        int add, subtract, multiply;
        float divide;

        add = num1 + num2;
        subtract = num1 - num2;
        multiply = num1 * num2;
        divide = (float) num1/num2;
        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + divide);



    }
}
