import java.util.Arrays;
public class EvenOdd{
 public static void main(String[] args){

   
  int[] numbers = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
  for(int count=0; count<numbers.length; count++){
    if(numbers[count] %2==0){
     System.out.print("The even numbers is: "+numbers[count]+" ");
     System.out.println();
    }
    if(numbers[count] %2!=0){
    System.out.print("The odd number is: "+numbers[count]+" ");
    System.out.println();
    }
   }
    }
}