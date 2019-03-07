import java.util.ArrayList;

public class Variance {
    
    public static int sum(ArrayList<Integer> list) {
        int k=0;
        for(int lis: list){
        
        k=k+lis;
        
        }
        return k;
    }
    
   
    public static double average(ArrayList<Integer> list) {
        double size = list.size();
        
        double average1 = sum(list)/size;
        
        
        return average1;
    }

    public static double variance(ArrayList<Integer> list) {
        
        double sum= 0;
        
        double averageoflist = average(list);
        
        for(int lis: list){
        sum = sum+ Math.pow((lis - averageoflist),2);
        
        
        }
       double hello = sum/(list.size()-1);
        return hello;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
