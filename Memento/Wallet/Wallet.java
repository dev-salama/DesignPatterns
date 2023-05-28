/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wallet4;

/**
 *
 * @author A
 */
public class Wallet {
    private String Coin;
    private float Amount;
    public String getCoin() {
        return Coin;
    }
    public void setCoin(String Coin) {
        this.Coin = Coin;
    }
    public float getAmount() {
        return Amount;
    }
    public void setAmount(float Amount) {
        this.Amount = Amount;
    }
    
    class memento{
        private String Coin;
        private float Amount;
        public memento(String Coin, float Amount) {
            this.Coin = Coin;
            this.Amount = Amount;
        }
    }
    
    memento getState(){
        return new memento(getCoin(),getAmount());
    }
    
    void restore(memento M){
        this.Coin = M.Coin;
        this.Amount = M.Amount; 
    }
    void display(){
        System.out.println("In wallet: "+getAmount()+getCoin());
    }
    
    
}
