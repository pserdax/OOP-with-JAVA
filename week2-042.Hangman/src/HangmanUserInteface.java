
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        // PROGRAM YOUR SOLUTION HERE
       
while(hangman.gameOn()){
    System.out.println("Type a command: ");
    String hey  = reader.nextLine();
    if(hey.equals("quit")){
            System.out.println("Thank you for playing!");
            break;
    }
    else if(hey.equals("status")){
    
    hangman.printStatus();
    
    }
    else if(hey.length()==1){  // command has only one letter, so it must be a guess
    
    hangman.guess(hey);
    }
    else if(hey.isEmpty()){
        
printMenu();    
    
    
    }
      hangman.printMan();
      hangman.printWord();
    }
    
    
    
}


    

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
