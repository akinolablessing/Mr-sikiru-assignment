import java.util.Scanner;
  public class Temp{
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the amount of water in kilogram:");
    double kilogram = scanner.nextDouble();

    System.out.print("Enter initial temperature:");
    double initialTemperature = scanner.nextDouble();

    System.out.print("Enter final temperature:");
    double finalTemperature = scanner.nextDouble();

   double energy = kilogram*(finalTemperature-initialTemperature)*4184;
   System.out.printf("Energy needed to heat water is:%.3f",energy);
  }
 }