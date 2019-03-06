import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String text = reader.nextLine();
        
        if(text.length()>3){
            
        char character = text.charAt(0);
        char ikinji_harp = text.charAt(1);
        char ucinji_harp = text.charAt(2);
        System.out.println("1. character: "+character);
        System.out.println("2. character: "+ikinji_harp);
        System.out.println("3. character: "+ucinji_harp );
        }
     
    }
}
