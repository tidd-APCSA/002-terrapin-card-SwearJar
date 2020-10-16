public class CardRunner {
    public static void main(String args[]){
        // ☕
        
        TerrapinCard billy = new TerrapinCard(20);
        TerrapinCard brian = new TerrapinCard(30);
        System.out.println(billy);
        System.out.println(brian);
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





// Creates a TerrapinCard for Billy with initial balance of 20 dollars
// Creates a TerrapinCard for Brian with initial balance of 30 dollars
// Billy buys gourmet lunch
// Brian buys economical lunch
// cards are printed (both on their own row, starting with the name of the card owner)
// Billy loads 20 dollars
// Brian buys gourmet lunch
// cards are printed (both on their own row, starting with the name of the card owner)
// Billy buys economical lunch
// Billy buys economical lunch
// Brian loads 50 dollars
// cards are printed (both on their own row, starting with the name of the card owner)


        
    }
}
