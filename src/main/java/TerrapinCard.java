public class TerrapinCard {
  private double balance;


  public TerrapinCard(double balance){
    this.balance = balance;
  }






  public void payEconomical() {
    
    if(this.balance >= 2.5){
      this.balance = balance - 2.5;
      
     }
  }





public void payGourmet() {
  
  if(this.balance >= 4.0){
    this.balance = balance - 4.0;
  }
}

public void loadMoney(double amount) {
  double maxBalance = 150;

  if (amount<0){
  return;
  }
  else if ((this.balance + amount)>150){
    this.balance = maxBalance;
  }
  else{
    this.balance += amount;
  }
}

public double getBalance(){
  return balance;
}


public String toString(){
  return "This card has " + balance + " dollars" ;
}



}


