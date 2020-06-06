import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Employee Id: ");
        int id = scanner.nextInt();// id is variable
        System.out.println("please enter Name: ");// this program print the name
        String name = scanner.next();
        System.out.println("Enter Basic Salary: ");
        int bs = scanner.nextInt();

        double hra, ta, da = 0.00, pf = 0.00, gs = 0.00;
        double basicsalary = 0.00;

        hra = 0.10 * bs;
        ta = 0.09 * bs;
        da = 0.08 * bs;
        pf = 0.20 * bs;
        gs = bs + hra + ta;
        basicsalary = da - pf;

        System.out.println("Gross salary:" + gs);
        System.out.println("Basic salary" + bs);

    }

}












