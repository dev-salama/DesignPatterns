/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaymentSystem;

/**
 *
 * @author A
 */
public abstract class Sender {
    public void sendPayment(float amount,int from,int to){
        Payment myPayment = createPayment();
        myPayment.doPayment(amount, from, to);
        myPayment.sendConifrmation();
    }
    public abstract Payment createPayment();
}
