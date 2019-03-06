
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int x = text.length()-1;
        String hello="";
        while(x>=0){
        
        char character = text.charAt(x);
        
        hello = hello + character;
           
        
           
        x--;
        
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
      
    }
      
        return hello;
        
    }
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
