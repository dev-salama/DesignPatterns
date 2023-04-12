/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stock;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A
 */
public class StockMarket {
    private float price;
    private List<Platform> platforms = new ArrayList<>();
    public void addPlatform(Platform p){
        if(!platforms.contains(p))
            platforms.add(p);
    }
    public void removePlatform(Platform p){
        platforms.remove(p);
    }
    public void setPrice(float price){
        this.price = price;
        display();
        for(Platform p: platforms)
            p.updatePrice(price);
    }
    
    public void display(){
        System.out.println("current price is: "+price);
    }
}
