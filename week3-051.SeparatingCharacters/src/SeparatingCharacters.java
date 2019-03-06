
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String text  = reader.nextLine();
        int x = text.length()+1;
        while(x<text.length()){
        
            
                    char character = text.charAt(x);
                    
                    System.out.println(x+". character: "+character);
                   
        
        
        
        }
    }
}
