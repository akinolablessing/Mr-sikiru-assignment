import java.util.Scanner;
   public class Statement{
    public static String compare(String name){
    if (name.equals("ayomide"){
     return true;
   
   }
  }
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a name:");
  String name = scanner.nextLine();


String name1 = compare(name);
  
 System.out.print("My name is "+name1);

  }
 }