import java.util.ArrayList;

public class AverageOfNumbers{
    
    
    public static double sum(ArrayList<Integer> list){
        double k=0;
        for(int lis: list){
        
        k=lis+k;
        
        }
        return k;
}
    public static double average(ArrayList<Integer> list){
        double size =list.size() ;
    double average1 = sum(list)/size;
    return average1;
    
    
    
    }

public static void main(String[] args){

ArrayList<Integer> list = new ArrayList<Integer>();

list.add(3);
list.add(2);
list.add(7);
list.add(2);
    System.out.println("The average is: " + average(list));




}

}