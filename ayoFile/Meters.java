import java.util.Scanner;
  public class Meters{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
   
     System.out.print("Enter an airplane acceleration and take-off:");
     double velocity = scanner.nextDouble();

     System.out.print("Enter the acceleration in  meter per second squared:");
     double acceleration = scanner.nextDouble();

    double lenght =  velocity*velocity/2*acceleration;
    System.out.printf("The minimum runway lenght is:%.3f",lenght);  
 }
}