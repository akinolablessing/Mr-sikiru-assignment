import java.util.ArrayList;
import java.util.Scanner;
public class CheckOutPro{
	public static void main(String[] args){
		String option =""; 
		ArrayList<String> array = new ArrayList<>();
		System.out.print("Dear customer what's your name: ");
 		Scanner scanner = new Scanner(System.in);

	   do{
  		String name = scanner.nextLine();
   		System.out.print("what did you buy dear:");
		String product = scanner.next();
		array.add(product);
		System.out.print("How many pieces?:");
  		int pieces = scanner.nextInt();
  		System.out.print("How much per unit:");
 		int unit = scanner.nextInt();
  
		System.out.print("""
		Add more items?:
		yes / no
		""");
 		option = scanner.next();
		}while(option.equals("yes"));
		System.out.print(array);
	}
}
	