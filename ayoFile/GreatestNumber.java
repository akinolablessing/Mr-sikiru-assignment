import java.util.Scanner;
  public class GreatestNumber{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

     int num;
     int num2;
     int num3;
     int largest;
System.out.print("Enter a number:");
 num = scanner.nextInt();

System.out.print("Enter a number:");
 num2 = scanner.nextInt();

System.out.print("Enter a number:");
 num3 = scanner.nextInt();

if (num>num2 & num>num3){
System.out.printf("The greatest number is:%d%n",num);
  }
if (num2>num & num2>num3){
System.out.printf("The greatest number is:%d%n",num2);
  }
 if (num3>num & num3>num2){
System.out.printf("The greatest number is:%d%n",num3);
   }

 }
}

