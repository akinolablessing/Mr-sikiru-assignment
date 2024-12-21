import java.util.Scanner;
public class Bmi{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

   System.out.print("Enter a weight in pounds:");
   double pounds = scanner.nextDouble();
  
   System.out.print("Enter height in inches:");
   double inches = scanner.nextDouble();

   double pound = pounds*0.45359237;
   double inche = inches*0.0254;

   double index = pound + inche;
   System.out.printf("Body mass index is:%.5f",index);
 }
}