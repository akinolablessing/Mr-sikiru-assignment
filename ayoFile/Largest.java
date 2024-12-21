import java.util.Arrays;
public class Largest{
public static void main(String[] args){

int largest =0;
int[] numbers = {55,77,8,11};

for(int count=0; count<numbers.length; count++){
if(numbers[count] > largest){
 largest = numbers[count];
 }
}
System.out.print(largest);
 }
}