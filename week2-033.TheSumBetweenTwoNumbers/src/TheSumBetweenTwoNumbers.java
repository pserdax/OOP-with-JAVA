
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First:");
        int san1 = Integer.parseInt(reader.nextLine());
        System.out.print("Last:");
        int san2 = Integer.parseInt(reader.nextLine());
        int sum = 0;
        while(san1<=san2){
        
        
        sum+=san1;
        san1++;
        }
        System.out.println("The sum is: "+sum);
    }
}
