
public class LyyraCard {
    private Double balance;
    
    public LyyraCard(Double balanceAtStart){
    
        this.balance = balanceAtStart;
     
    }
    public String toString(){
    
        return "The card has "+this.balance+" euros";
    }
    
    public void payEconomical(){
        if(this.balance>=2.5){
        
            this.balance = this.balance -2.5;
        }
        }
    public void payGourmet(){
    
        if(this.balance>=4){
        this.balance=this.balance-4;
    }
    

    }
    public void loadMoney(Double amount){

        if(amount>0){
       
        if(this.balance>150){
        
            this.balance=150.0;
        }
        else{
        
        this.balance=this.balance+ amount;
        }
        }
        
        else{
        
            this.balance=this.balance+0;
        }
    }
    
    
}
