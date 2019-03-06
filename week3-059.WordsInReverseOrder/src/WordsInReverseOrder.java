import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class WordsInReverseOrder{
public static void main(String args[]){
    
Scanner reader = new Scanner(System.in);
ArrayList<String> words = new ArrayList<String>();

while(true){
    System.out.print("Type a word: ");
    
    String word = reader.nextLine();
    
    if(word.isEmpty()){
        

       
    break;
    
    }
    else{
    
    
    words.add(word);
   
    
    
    }


}
 System.out.println("You typed the following words: ");
 
 Collections.reverse(words);
for(String word: words){

       System.out.println(word);

        }
    








}


}