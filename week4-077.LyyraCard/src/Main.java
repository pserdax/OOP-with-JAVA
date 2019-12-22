public class Main{


    public static void main(String args[]){
    
     LyyraCard card_pekka = new LyyraCard(20.0);
     LyyraCard card_brian = new LyyraCard(30.0);
     
     card_pekka.payGourmet();
     card_brian.payEconomical();
     
        System.out.println("Pekka: " + card_pekka);
        System.out.println("Pekka: " + card_brian);
       
        
        card_pekka.loadMoney(20.0);
        card_brian.payGourmet();
        System.out.println("Pekka: " + card_pekka);
        System.out.println("Pekka: " + card_brian);
        
      
        card_brian.loadMoney(50.0);
        
        card_pekka.payEconomical();
        card_pekka.payEconomical();
        
        System.out.println("Pekka: " + card_pekka);
        System.out.println("Pekka: " + card_brian);
        
    }
}