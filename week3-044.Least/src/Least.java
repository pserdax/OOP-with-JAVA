import java.util.Scanner;

public class Least{

public static void main(String[] args){

int result = least(2,7);
    System.out.println("Least:"+result);


}
public static int least(int number1, int number2){
    if(number1>number2){
    
    return number2;
    
    
    }
    else {
    return number1;
    }

}
}