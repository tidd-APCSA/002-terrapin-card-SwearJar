public class TerrapinCard {
  private double balance;


  public TerrapinCard(double balance){
    this.balance = balance;
  }


  public double getBalance(){
    return balance;
  }




  public void payEconomical() {
    double price = 2.5;
    if(balance - price > 0){
      balance -= price;
      
     }
  }





public void payGourmet() {
  double price = 4.0;  
  if(balance - price > 0){
      balance -= price;
  }
}

public void loadMoney(double amount) {
  double newBalance= balance +amount;
  double maxBalance = 150;

  if (amount<0){
  return;
  }
  if (newBalance > maxBalance){
    balance = maxBalance;
  }
  else{
    balance = newBalance;
  }
}



public String toString(){
  return "This card has " + balance + " dollars" ;
}



}


