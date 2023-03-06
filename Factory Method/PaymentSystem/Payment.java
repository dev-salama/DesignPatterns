/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PaymentSystem;

/**
 *
 * @author A
 */
public interface Payment {
    public void doPayment(float amount, int from, int to);
    public void sendConifrmation();
}
