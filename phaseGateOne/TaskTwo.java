import java.util.Scanner;
public class TaskTwo{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number between 0 and 1000:");
int number = scanner.nextInt();

int firstInteger = number%10;
int secondInteger  = number%100/10;
int thirdInteger = number/100;

int sum = firstInteger + secondInteger+thirdInteger;

System.out.print("The sum of the number is "+ sum);

}
}