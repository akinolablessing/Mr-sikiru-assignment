public class Pangram  {
	public static void main(String[] args){
	String text = ("The quick brown fox jumps over the lazy dog");
	System.out.println("The quick brown fox jumps over the lazy dog");
	System.out.print(alphabet(text));

}
public static boolean alphabet(String text){
	for(int count=0; count < 26; count++){
		for(int alphabet ='a'; alphabet <='z'; alphabet++){
                   for(int index=0; index < text.length(); index++){
			if(alphabet == text.charAt(index)){
                              return true;
 }
 }
 }

 }
  return false;
 }
}