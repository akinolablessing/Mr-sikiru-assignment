
import java.util.Scanner;
public class TaskThree{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number:");
int firstNumber = scanner.nextInt();

System.out.print("Enter a number:");
int secondNumber = scanner.nextInt();

System.out.print("Enter a number:");
int thirdNumber = scanner.nextInt();


if(firstNumber > secondNumber || firstNumber > thirdNumber ){
 System.out.println(firstNumber);
}
if(secondNumber > firstNumber || secondNumber > thirdNumber ){
 System.out.println(secondNumber);
}
if(thirdNumber> firstNumber || thirdNumber > secondNumber ){
 System.out.println(thirdNumber);
}

}
}
