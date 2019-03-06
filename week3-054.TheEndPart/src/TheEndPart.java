import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        
        System.out.println("Length of the end part: ");
        int end_part = reader.nextInt(); 
        String result = word.substring(word.length()-end_part);
        
        System.out.println("Result: "+result);
    }
}
