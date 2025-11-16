/*Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), 
saldo (privado) e titular (publico). Implemente métodos getters e setters para os 
atributos privados. */

public class BankAccount {
    private int numberAccount;
    private double balance;
    private String owner;

    public void setNumberAccount(int numberAccount){
        this.numberAccount = numberAccount;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }   

    public int getNumberAccount(){
        return numberAccount;
    }
    
    public double getBalance(){
        return balance;
    }

    public String getOwner(){
        return owner;
    }

}
