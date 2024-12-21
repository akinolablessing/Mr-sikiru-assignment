import java.util.Arrays;
public class AddArrays{
 public static void main(String[] args){

  int total = 0;
 int[] numbers = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
  for(int count =0; count<numbers.length; count++){
     total = total+numbers[count];
  }
 System.out.printf("The sum is: %d",total);
 }
}