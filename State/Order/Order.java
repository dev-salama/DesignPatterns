/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StatePattern4;

/**
 *
 * @author A
 */
public class Order {
    // Process - Ship - Cancel
    
    private OrderState CurrentState;
    public void setCurrentState(OrderState CurrentState) {
        this.CurrentState = CurrentState;
    }
    
    void processOrder(){
        CurrentState.ProcessOrder(this);
    }
    void shipOrder(){
        CurrentState.ShipOrder(this);
    }
    void cancelOrder(){
        CurrentState.CancelOrder(this);
    }

}
