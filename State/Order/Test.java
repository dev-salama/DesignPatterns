/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StatePattern4;

/**
 *
 * @author A
 */
public class Test {
    public static void main(String[] args) {
        Order order105 = new Order();
        order105.setCurrentState(new ProcessState());
        order105.cancelOrder();
        order105.shipOrder();
    }
}
