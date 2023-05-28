/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StatePattern4;

/**
 *
 * @author A
 */
public class ProcessState implements OrderState{

    @Override
    public void ProcessOrder(Order order) {
        System.out.println("Processing order...");
        order.setCurrentState(new ShipState());
    }

    @Override
    public void ShipOrder(Order order) {
        System.out.println("Can not ship the order before process it");
    }

    @Override
    public void CancelOrder(Order order) {
        System.out.println("Canceling order...");
        order.setCurrentState(new CancelState());
    }
    
}
