import java.util.Scanner;
  public class Binary{
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number:");
    int number = scanner.nextInt();
  
     int num = number / 2;
     int mod = number % 2;
     int num1 = num / 2;
     int mod1 = num % 2;
     int num2 = num1 / 2;
     int mod2 = num1 % 2;

   System.out.printf("%d %d %d",mod2,mod1,mod);
    
    }
   }