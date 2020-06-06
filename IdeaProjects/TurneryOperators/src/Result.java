import java.util.Scanner;

public class Result
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//This program assumes that student has 3 subjects
        System.out.println("Please enter your Maths marks: ");
        int maths = scanner.nextInt();
        System.out.println("Please enter your English marks: ");
        int english = scanner.nextInt();
        System.out.println("Please enter your Science marks: ");
        int sci = scanner.nextInt();

        int marks = maths;
        System.out.println(marks);//This program assume that if student pass in all 3 subject then pass
        if (marks > 35) {
            System.out.println("You are Pass");
        } else if (marks < 35) {
            System.out.println("You are Fail");//if student fail in one subject then fail
        }
        int science = sci;
        System.out.println(sci);
        if (sci > 35) {
            System.out.println("You are Pass");
        }else if (sci < 35) {
            System.out.println("You are Fail");

            int eng = english;
            System.out.println(english);
            if (english > 35) {
                System.out.println("You are Pass");
            }else if (english < 35) {
                System.out.println("You are Fail");
            }

        }


    }
}
