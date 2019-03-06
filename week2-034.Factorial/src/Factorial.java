import java.util.Scanner;
public class Factorial{
public static void main(String[] args){
    
    String at = "Serdar";
    int a = 3;
    int b = 4;
    gowmy(at, a);
    System.out.println("and");
    gowmy(at, b);

}
public static void salam(String name){

    System.out.println("Hi, "+ name +" ,nice to meet with you!");

}
public static void gowmy(String name, int number){

    int i=0;
    while(i<number){
    salam(name);
    i++;
    }


}


}