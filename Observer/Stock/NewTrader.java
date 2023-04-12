/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stock;

/**
 *
 * @author A
 */
public class NewTrader  implements Platform{
    private float price;

    @Override
    public void updatePrice(float price) {
        this.price = price;
        display();
    }
    public void display(){
        System.out.println("the new Trader updated with price: "+price);
    }
}
