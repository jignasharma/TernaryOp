public class Even_Odds
{
  public static void main(String []args)
  {
      int num1 = 100;
      int num2 = 111;

      switch (num1%2){
          case 0:
              System.out.println(num1 +" is an even number");
              break;
          case  1:
              System.out.println(num2 +" is an odd number");
              break;

          default:
              System.out.println("number is not even or odd");

      }
  }


}
