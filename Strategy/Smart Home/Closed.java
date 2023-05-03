/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author A
 */
public class Closed implements DoorMode{

    @Override
    public void procces() {
        System.out.println("Closing all doors in home");
    }
    
}
