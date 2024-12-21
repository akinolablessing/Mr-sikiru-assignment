import java.util.Scanner;
  public class Efficiency{ 
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the time taken by the worker:");
     int time = scanner.nextInt();

     if (time<=3){
     System.out.print("Highly efficient");
     }
   if (time>=4){
     System.out.print("Ordered to improve speed");
     }
   if (time<=5){
     System.out.print("Training to improve his speed");
     }
   if (time>5){
     System.out.print("Worker has to leave the company");
   }

  }
 }