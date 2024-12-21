import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  ArrayList<Integer> numbers = new ArrayList<>();

 for(int count=0; count<3; count++){
System.out.print("Enter a number: ");
 int number = scanner.nextInt();
 numbers.add(number);
  }
 System.out.print(numbers);
  }
 }
