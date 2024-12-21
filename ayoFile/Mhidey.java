import java.util.Scanner;
  public class Mhidey{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     
    System.out.print("Enter a name:");
    String name = scanner.nextLine();

   switch(name){
    case("Ester"):
    System.out.print("She is agbo doctor, with glowing skin");
    break;

    case("Gloria"):
    System.out.print("She is so calm, dark with beauty");
    break;
 
    case("Mercy"):
    System.out.print("Our beautiful prietest with golden heart");
    break;

    default:
    System.out.print("Who are you?");

  }
 }
}

