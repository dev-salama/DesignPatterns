/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wallet4;

import Wallet4.Wallet.memento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A
 */
public class CareTaker {
    List<memento> states = new ArrayList<>();
    
    void addMemento(memento m){
        states.add(m);
    }
}
