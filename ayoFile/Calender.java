import java.util.Scanner;
   public class Calender{
     public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

     String month = "Jan"; 
     String month1 = "Feb"; 
     String month2 = "Mar"; 
     String month3 = "April"; 
     String month4 = "May"; 
     String month5 = "June"; 
     String month6 = "July"; 
     String month7 = "August"; 
     String month8 = "Sep"; 
     String month9 = "Oct"; 
     String month10 = "Nov"; 
     String month11 = "Dec";
   
     int number1 = 29;
     int number2 = 30;
     int number3 = 31;

System.out.print("Enter number of month:");
int number = scanner.nextInt();

System.out.print("Enter number of year:");
int year = scanner.nextInt();

if (number1 == number){
 System.out.printf("%s %d has %d days",month1,year,number); 
  }
  if (number2 == number){
 System.out.printf("%s  %s  %s  %s  %d has %d days",month2,month5,month8 ,month10,year,number); 
  }
 if (number3 == number){
 System.out.printf(" %s %s %s %d has %d days",month3,month4,month6, year,number); 
  }

 }
}