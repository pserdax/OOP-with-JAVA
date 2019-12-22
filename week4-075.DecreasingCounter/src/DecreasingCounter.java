public class DecreasingCounter{

    private int value;
    private int i;
    

        
    
        public DecreasingCounter(int numberAtStart){

            this.value = numberAtStart;
            this.i=numberAtStart;
            
    
}
        public void print(){
        
            System.out.println(this.value);
            
        }
        public void decrease(){
        
            if(this.value==0){
            this.value = 0;
            
            }
            else{
            this.value--;
        }}
        public void reset(){
            this.value=0;
              
        }
        
        
    
    }
    

