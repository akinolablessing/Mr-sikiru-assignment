import java.util.Scanner;
 public class NegativePositiveZerosNumber{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

    int number = 0;
    String question = "";

  do{
    System.out.print("Enter a number:");
      number = scanner.nextInt();
      
     if (number<0){
      System.out.printf("%d is a negative number",number);
     }
    if (number>0){
      System.out.printf("%d is a positive number",number);
   }
   if (number==0){
      System.out.printf("%d is a Zeros number",number);
   }
   System.out.print("\nWould you like to perform another operation?");
    question = scanner.next();
   }while(question.equals("yes"));

  }
 }
  