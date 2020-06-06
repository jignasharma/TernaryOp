import java.util.Scanner;
import java.util.concurrent.Callable;

public class SaleCommission
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double Commissionrate;
        double Salesamount, Commission;
        System.out.println("Please enter your sale id");
        scanner.nextInt();
        System.out.println("Please enter your name");
        scanner.next();
        System.out.println("Please enter your basic salary");
        int salary = scanner.nextInt();
        System.out.println("Please enter Sales Amount ");
        Salesamount = scanner.nextDouble();

        if (Salesamount >= 50000)
            Commissionrate = 0.35;
        else if (Salesamount >= 49999 && Salesamount <= 30000)
            Commissionrate = 0.20;
        else if (Salesamount >= 29999 && Salesamount <= 20000)
            Commissionrate = 0.10;
        else if (Salesamount >= 19999 && Salesamount <= 10000)
            Commissionrate = 0.05;
        else
            Commissionrate = 0.02;

        Commission = Commissionrate * Salesamount;
        System.out.println("The total and Commission is:" + '£' + (salary + Commission));




                }
            }



