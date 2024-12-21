import java.util.Scanner;
  public class Numbers{
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

     System.out.print("Enter first number:");
     int firstNumber = scanner.nextInt();

    System.out.print("Enter second number:");
     int secondNumber = scanner.nextInt();

     System.out.print("Enter third number:");
     int thirdNumber = scanner.nextInt();

     if (firstNumber==secondNumber && secondNumber==thirdNumber && thirdNumber==firstNumber){
    System.out.print("All are equal!!");
     }
     else{
     System.out.print("All are not equal!!");
    }
  }

 }