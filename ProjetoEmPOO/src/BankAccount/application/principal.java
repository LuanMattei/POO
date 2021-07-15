package ProjetoEmPOO.src.BankAccount.application;

import ProjetoEmPOO.src.BankAccount.entities.BusinessAccount;
import ProjetoEmPOO.src.BankAccount.entities.Conta;
import ProjetoEmPOO.src.BankAccount.entities.SavingsAccount;

public class principal {
  public static void main(String[] args) {
    Conta acc = new Conta(1001,"Luan Souza",0.0);
    //Upcasting  - Pegar o bacc e virar um acc
    Conta acc2 = new BusinessAccount(1003, "Other person", 1000.0, 200.0);
    Conta acc3 = new SavingsAccount(1004, "Adriano imperador", 1000.0, 0.01);
    //Downcasting
    if(acc3 instanceof SavingsAccount){
      SavingsAccount acc5 = (SavingsAccount) acc3;
     acc3.withdraw(200.0);
      System.out.println(acc5.getBalance());
    }
    BusinessAccount acc4 = (BusinessAccount) acc2;
    acc4.withdraw(200.0);
    System.out.println(acc4.getBalance() );
}
}
