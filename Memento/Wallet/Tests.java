/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wallet4;

import Wallet4.Wallet.memento;

/**
 *
 * @author A
 */
public class Tests {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        CareTaker ct = new CareTaker();
        myWallet.setCoin("$");
        myWallet.setAmount(100f);
        myWallet.display();
        ct.addMemento(myWallet.getState());
        
        myWallet.setAmount(150f);
        myWallet.display();
        ct.addMemento(myWallet.getState());

        myWallet.setAmount(130f);
        myWallet.display();
        ct.addMemento(myWallet.getState());
        
        myWallet.restore(ct.states.get(1));
        myWallet.display();

        
    }
}
