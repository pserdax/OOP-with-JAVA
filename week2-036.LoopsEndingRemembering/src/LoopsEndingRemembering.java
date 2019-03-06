import java.util.Scanner;

public class LoopsEndingRemembering{
public static void main(String args[]){

    Scanner reader = new Scanner(System.in);
    System.out.println("Type numbers: ");
    int san1 = Integer.parseInt(reader.nextLine());
    int sum = 0;
    int i = 0;
    int even = 0;
    int odd = 0;
    double avarage;
    while(san1 != -1){
    if(san1 % 2 == 0){
    even ++;
     }
    else{
    odd ++;
    }
    i++;
    sum += san1; 
    san1 = Integer.parseInt(reader.nextLine());
    
    }
    avarage = (double)sum/i;
    System.out.println("Thank you and see you later!");
    System.out.println("The sum is " + sum);
    System.out.println("How many numbers: " + i);
    System.out.println("Average: " + avarage);
    System.out.println("Even numbers: " + even);
    System.out.println("Odd numbers: " + odd);
}

}