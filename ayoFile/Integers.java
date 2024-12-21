import java.util.Scanner;
  public class Integers{
   public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

   int num ;
   int num2;
   int largest;
 System.out.print("Enter a number:");
 num = scanner.nextInt();

System.out.print("Enter a number:");
  num2 = scanner.nextInt();
 
 if(num>num2){
   largest = num;
System.out.printf("The largest number is:%d%n",largest);
}
else{
  largest = num2;
System.out.printf("The largest number is:%d%n",largest);
  }
 }
}


