import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number:");
int firstNumber = scanner.nextInt();

System.out.print("Enter a number:");
int secondNumber = scanner.nextInt();

System.out.print("Enter the sum of the two numbers:");
int sum = scanner.nextInt();

int sumOne = firstNumber + secondNumber;

if(sum == sumOne ){
 System.out.print(true);
}
else{
  System.out.print(false);
}
}
}