public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(3);

        counter.print();
        counter.reset();
        counter.print();
        counter.decrease();
        counter.print();
        counter.decrease();
        counter.print();
        counter.decrease();
        counter.print();
        
        
    }
}
