/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package StatePattern4;

/**
 *
 * @author A
 */
public interface OrderState {
    void ProcessOrder(Order order);
    void ShipOrder(Order order);
    void CancelOrder(Order order);
}
