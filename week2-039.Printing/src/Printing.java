public class Printing{

    public static void  printStars(int amount){
    
    int i=0;
    while(i<amount){
    
        System.out.print("*");
        i++;
    
    }
        System.out.println("");
    
    
    }
    public static void printSquare(int sideSize){
    int i=0;
    while(i<sideSize){
    printStars(sideSize);
    i++;
    }
    }
    
    public static void  printRectangle(int width, int height){
    
    int i=0;
    while(i<height){
    printStars(width);
    i++;
    }
    
    }
    
    public static void printTriangle(int size){
    
    int i = 1;
    while(i<=size){
        printStars(i);
        i++;
    
    }
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
public static void main(String[] args){

 printStars(5);
    System.out.println("\n-----");
         
 printSquare(5);
    System.out.println("\n-----");
    
 printRectangle(4,5);   
    System.out.println("\n-----");
    
printTriangle(5);
}


}
