/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stock;

/**
 *
 * @author A
 */
public class Test {
    public static void main(String[] args) {
        StockMarket sm = new StockMarket();
        Trader t = new Trader();
        TradingView tv = new TradingView();
        NewTrader nt = new NewTrader();
        sm.addPlatform(t);
        sm.addPlatform(tv);
        sm.addPlatform(nt);
        sm.removePlatform(nt);
        sm.setPrice(533.46f);


    }
}
