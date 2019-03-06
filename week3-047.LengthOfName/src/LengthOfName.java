
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text  = reader.nextLine();
        System.out.println("The length of name is "+calculateCharacters(text) );
        // call your method from here
    }
    
    // do here the method
   public static int calculateCharacters(String text){
       
       return text.length();
       
       
       
       
  
   
   }
    
}
