import java.util.Scanner;
  public class ThreeNumbers{
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    
     String question = "";

do{
  System.out.print("Enter a number:");
   int firstNumber = scanner.nextInt();
  System.out.print("Enter a number:");
   int secondNumber = scanner.nextInt();
  System.out.print("Enter a number:");
  int thirdNumber = scanner.nextInt();

if (firstNumber==secondNumber && secondNumber==thirdNumber && thirdNumber==firstNumber){
    System.out.print("All are equal!!");
     }
     else{
     System.out.print("All are not equal!!");
    }
    System.out.print("\nWould you like to perform another one?");
     question = scanner.next();

  }while(question.equals("yes"));

 }
}