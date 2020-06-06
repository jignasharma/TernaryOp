import java.util.Scanner;

public class Value_Check
{
  public static void main(String[] args)//Static method available in Character claa
  {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter any value");
    char c = '*';

    if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
        System.out.println(c + " is an alphabet.");
    else
        System.out.println(c + " is not an alphabet.");
}
}
