import java.util.Scanner;

public class MarkSheet
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student Name: ");
        String name = scanner.next();
        System.out.println("Please enter student Roll Number: ");
        int rollnum = scanner.nextInt();
        System.out.println("Please enter your Maths marks: ");
        int maths = scanner.nextInt();
        System.out.println("Please enter your English marks: ");
        int english = scanner.nextInt();
        System.out.println("Please enter your Science marks: ");
        int sci = scanner.nextInt();
        int total = maths +  sci + english;
        double percentage = total/3 ;
        System.out.println("Total marks = "+total);
        System.out.println("Percentage = "+percentage);//calculating percentage here
        if (percentage >=80) {
            System.out.println("A+ Grade");

        }
        else if (percentage >=60 && percentage < 80){
            System.out.println("A grade");
        }
        else if (percentage>= 50 && percentage < 60){
            System.out.println("B grade");
        }
        else if (percentage >= 35 && percentage < 50 ){
            System.out.println("C grade");
        }else {
            System.out.println("Fail");
        }

    }
}
