import java.util.Scanner;
  public class FutureInvestmetValue{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter investment amount:");
     double investment = scanner.nextDouble();

    System.out.print("Enter annual interest rate in percentage:");
    double interest = scanner.nextDouble();

    System.out.print("Enter number of years:");
    double years = scanner.nextDouble();

    double mountlyInvestRate =  (interest/12 )/100;
    double futureInvestmentValue =  investment * (1 + mountlyInvestRate )* years*12;
    System.out.printf("Future investment value is:%.3f",futureInvestmentValue);

  } 
 }