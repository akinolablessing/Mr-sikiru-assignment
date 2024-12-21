public class Addition {
  public static int number(int firstNumber, int secondNumber){
    int result = firstNumber + secondNumber;
    return result;
  }

  public static void main(String[] args){
   
   int result = number(1,3);
   int secondResult = number(2,4);
   int thirdResult = number(9,1);

   System.out.print(result + "\n" + secondResult + "\n" + "");
  }
}