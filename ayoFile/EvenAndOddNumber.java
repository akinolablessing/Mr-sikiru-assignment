import java.util.Scanner;
  public class EvenAndOddNumber{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     
    System.out.print("Enter a number:");
    int number = scanner.nextInt();
   
     if (number%2==0){
       System.out.print("1");
      }
      if (number%2!=0){
        System.out.print("0");
    
   }   
  }
 }