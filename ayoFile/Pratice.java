import java.util.Scanner;
  public class Pratice{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

      int num = 0;
      String ques = "";

      do{
     System.out.print("Enter a number:");
      num = scanner.nextInt();
     System.out.print("Would you like to continue?");
      ques = scanner.next();

        if (num > 50){
       System.out.printf("The largest number is:%d%n",num);
        }
       if (num < 49){
       System.out.printf("The smallest number is:%d%n",num);
        }
     }while(ques.equals("yes"));
  }
 }