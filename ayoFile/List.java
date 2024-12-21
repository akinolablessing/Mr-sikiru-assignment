import java.util.Scanner;
import java.util.ArrayList;
public class List{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 ArrayList<String> numbers = new ArrayList<String>();

for(int count=0; count<4; count++){
 System.out.print("Enter a number-->>");
 String num = scanner.nextLine();
 numbers.add(num);
}
System.out.print(numbers);
}
}