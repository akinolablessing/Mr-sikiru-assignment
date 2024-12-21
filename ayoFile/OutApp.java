import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
public class OutApp{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

    String option = "";
   ArrayList<String> array = new ArrayList<>();
   Integer integer = new Integer();

   System.out.print("Dear customer what's your name: ");
  String name = scanner.nextLine();

 do{
   	System.out.print("what did you buy dear:");
	String buy = scanner.next();
	array.add(buy);

	System.out.print("How many pieces?:");
        String pieces = scanner.next();
	array.add(pieces);

        System.out.print("How much per unit:");
        String unit = scanner.next();
        array.add(unit);

        System.out.print(array);
        System.out.print("""
Add more items?:
yes / no
""");
   option = scanner.next();
            
     
}while(option.equals("yes"));


 }
}