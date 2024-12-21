import java.util.Scanner;
public class NegativePositive{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter number to check if positive or negative:");
 int number = scanner.nextInt();
  if(number < 0){
    System.out.print("Negative Number!!");
  }
  else{
   System.out.print("Positive Number!!");
  }
  }
}
