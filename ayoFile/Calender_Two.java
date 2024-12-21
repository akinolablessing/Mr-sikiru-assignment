import java.util.Scanner;
  public class Calender_Two{
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
     
   System.out.print("Enter a month number:");
   int number = scanner.nextInt();

   System.out.print("Enter a year:");
   int year = scanner.nextInt();

   switch(number){ 
     case (2):
System.out.printf("%s %d has 29 days",month1,year);
    break;
      case (1):
   System.out.printf("%s %d has 31 days",month,year,number);
      break;
    case (3):
   System.out.printf(" %s  %d has 31 days",month2, year,number);
    break;
    case (4):
   System.out.printf(" %s  %d has 30 days",month3, year,number);
    break;
    case (5):
   System.out.printf(" %s  %d has 31 days",month4,year,number);
    break;
    case (6):
   System.out.printf(" %s  %d has 30 days",month5, year,number);
    break;
     case (7):
   System.out.printf(" %s  %d has 31 days",month6, year,number);
    break;
 case (8):
   System.out.printf(" %s  %d has 31 days",month7, year,number);
    break;
 case (9):
   System.out.printf(" %s  %d has 30 days",month8, year,number);
    break;
 case (10):
   System.out.printf(" %s  %d has 31 days",month9,year,number);
    break;
 case (11):
   System.out.printf(" %s  %d has 30 days",month10, year,number);
    break;
   case (12):
   System.out.printf(" %s  %d has 31 days",month11,year,number);
    break;

    default:
     System.out.println("TRY HARDER AYOMIDE");
     break;
   }    
  }  
}
