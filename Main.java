import java.util.Scanner;    // Needed for the Scanner class
class Main {
  public static void main(String[] args) {
    // Create a Scanner object for keyboard input.
      Scanner console = new Scanner(System.in);
      int     number,    // to hold the number
              x;         // to hold the factorial

      // Get the number.
      System.out.print("Enter number : ");
      number = console.nextInt();

      // Call factorial method and return result to x.
      x = factorial(number);

      // Display the factorial.
      System.out.println("Factorial : " + x);
  }
  public static int factorial(int num)
   {
      int fact = 1;

      for (int i = 1; i <= num; i++)
      {
         fact = fact * i;
      }

      return fact;
   }
}