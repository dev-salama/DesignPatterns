/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stock;

/**
 *
 * @author A
 */
public class TradingView implements Platform{
    private float price;

    @Override
    public void updatePrice(float price) {
        this.price = price;
        display();
    }
    public void display(){
        System.out.println("the TradingView updated with price: "+price);
    }
    
    
}
