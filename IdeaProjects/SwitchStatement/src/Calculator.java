import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");//Using data type int
        int num1;
        num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2;
        num2 = scanner.nextInt();
        System.out.println("Addition-a: Subtract-s: Multiplication-m: Division-d");

        char operator = scanner.next().charAt(0);
        System.out.println("Select operator");

        switch (operator) {

            case 'a':
                System.out.println("Sum of the given two numbers: " + (num1 + num2));
                break;
            case 's':
                System.out.println("Subtract the given numbers: " + (num1 - num2));
                break;
            case 'm':
                System.out.println("Multiply of the two numbers: " + (num1 * num2));
                break;
            case 'd':
                System.out.println("Result of the divison: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid result");

        }


    }


}







