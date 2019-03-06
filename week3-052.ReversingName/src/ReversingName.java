import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        
        String text = reader.nextLine();
        int x = text.length()-1;
        System.out.print("In reverse order: ");
        while(x>=0){
        
        char character  = text.charAt(x);
            System.out.print(character);
            x--;
        
        }
        System.out.println("");
        
        }
        
        
    }
