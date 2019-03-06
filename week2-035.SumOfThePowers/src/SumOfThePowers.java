
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int san = Integer.parseInt(reader.nextLine());
        int i  = 0;
        int sum = 0;
        
       
        while(i<=san){
         int result = (int)Math.pow(2,i);
         sum+=result;
         
         i++;
        
        
        }
        System.out.println(sum);

    }
}
