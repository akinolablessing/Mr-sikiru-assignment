//Question:
//1) Collect 3 strings store in an array if any of the string contains a vowel return true else return false
//2)Store user input in a variable , and return the length of the string inputted by the user..
//3)Collect a string and return the reverted string.
//4)Store a set of strings into an array and return the values from the array without the square [] bracket..


public class VowelNames{
 public static boolean names(String[]  name){

  char[] vowel = {'a', 'e', 'i', 'o', 'u'};
   for(int counter = 0; counter < name.length; counter++){
	String word = name[counter];

	System.out.println(word);
    for(int index = 0; index < word.length(); index++){
	char letter = word.charAt(index);
	System.out.println(letter);
	if(letter == vowel[counter]){
	  return true;
	}    
     }
    }
	return false;
 }

 public static void main(String[] args){

  String[] name = {"eyt" , "hstxr" , "Blesstng"};
   for(int counter = 0; counter< name.length; counter++){
     System.out.print(names(name));
   }	
 
 }
}