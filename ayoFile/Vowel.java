import java.util.Arrays;
public class Vowel{

public static boolean isVowel(String[] names){
for(int count=0; count<names.length; count++){
  String words = names[count];
  char letters = words.charAt(count);
  if(letters=='a' || letters== 'e' || letters== 'i' || letters== 'o' ||letters== 'u' ){
  return true; 
 }
 }
 return false;
 }
 public static void main(String[] args){
  String[] name = {"ayo","mercy","joy"};
  System.out.print(isVowel(name));

 }
}