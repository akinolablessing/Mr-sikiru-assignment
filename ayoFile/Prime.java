import java.util.Scanner;
public class Prime{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

  int positiveCounter= 0;
  int negativeCounter= 0;
  int numberCounter=1;
 
  while(numberCounter<=5){
   System.out.print("Enter a number:");
     int number = scanner.nextInt();

    if(number>0){
     positiveCounter += 1;
   }
   else{
     negativeCounter += 1;
   }
   numberCounter++;
  }
  System.out.printf("We have %d positive number",positiveCounter);
 }
}