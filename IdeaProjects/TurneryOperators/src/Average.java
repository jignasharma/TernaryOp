import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first numbers: ");//This program find average of five numbers.
        int num1 = scanner.nextInt();

        System.out.println("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Input third numbers: ");
        int num3 = scanner.nextInt();

        System.out.println("Input forth number: ");
        int num4 = scanner.nextInt();

        System.out.println("Input fifth numbers: ");
        int num5 = scanner.nextInt();

        System.out.println("Average of five numbers is: "+
                (num1 + num2 + num3 + num4 + num5) / 5);
    }

}