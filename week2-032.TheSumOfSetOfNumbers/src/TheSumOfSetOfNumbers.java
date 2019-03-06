import java.util.Scanner;

public class TheSumOfSetOfNumbers{
public static void main(String[] arg){

    Scanner reader  = new Scanner(System.in);
    System.out.println("Haýsy sana çenli gitsin: ");
    int girizilen_san = Integer.parseInt(reader.nextLine());
    int sum = 0;
    int i = 1;
    while(i <= girizilen_san){
    
    sum+=i; //sum=sum+1;
    i++;//i=i+1;
    
    }
    System.out.println("Girizilen sanlaryn goşulany: "+sum);
    
    
    
}


}
