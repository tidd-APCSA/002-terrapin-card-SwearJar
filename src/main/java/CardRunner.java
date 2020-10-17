public class CardRunner {
    public static void main(String args[]){
        // ☕
        
        TerrapinCard billy = new TerrapinCard(20);
        TerrapinCard brian = new TerrapinCard(30);

        billy.payGourmet();
        brian.payEconomical();

        System.out.println("Billy: "+billy);
        System.out.println("Brian: " +brian);

        brian.payGourmet();
        billy.loadMoney(20);

        System.out.println("Billy: "+billy);
        System.out.println("Brian: " +brian); 

        billy.payEconomical();
        billy.payEconomical();

        brian.loadMoney(50);
        
        System.out.println("Billy: "+billy);
        System.out.println("Brian: " +brian);    








        
    }
}
