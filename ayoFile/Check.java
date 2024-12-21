import java.util.Scanner;
    public class Check{
     public static boolean compare(String name){
      if (name.equals("Ayomide")){
      return true;
 }
	return false;
}
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     
      System.out.print("Enter a name:");
      String name1 =scanner.nextLine();
      
     boolean result = compare(name1);   
     System.out.printf("Result is:%s",result);
 }
}