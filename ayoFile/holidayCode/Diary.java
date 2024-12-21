import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Diary{
 static ArrayList<String> diary = new ArrayList<String>();
 static Scanner input = new Scanner(System.in); 
 
static int pin =0;

public static void mainMenu(){
 String prompt ="""
       Welcome to Ayo's diary App!!
       Create a new pin code
      """;
System.out.print(prompt);
 pin = input.nextInt();
if(pin > 0){
 createDiary();
 }

}
  public static void createEntry(){
 
   
   System.out.print("Enter diary number:");
   diary.add(input.nextLine());

   System.out.print("Enter a title:");
   diary.add(input.nextLine());

   System.out.print("Enter the content of the diary:");
   diary.add(input.nextLine());
   
   System.out.println(diary);
  
  }

  public static void main(String[] args){
   createEntry();
  
  }
 public static void createDiary(){
   String prompt ="""
        
        1.Lock diary
        2.Update diary
        3.Delete entry
        4.Add entry
        5.Find entry by id
        6.Unlock diary
        """;
   System.out.print(prompt);
  int create = input.nextInt();
 switch(create){
 
 case 4:
 createDiary();
 break;

 }

 } 
}