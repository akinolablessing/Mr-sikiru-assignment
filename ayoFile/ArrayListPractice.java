import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListPractice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<>();

		for(int counter = 0; counter < 3; counter++){
			System.out.print("Enter a name: ");
			String names = scanner.nextLine();
			array.add(names);
		}
		System.out.print(array);
	}
}