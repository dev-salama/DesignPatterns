/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaymentSystem;

/**
 *
 * @author A
 */
public class PaypalSender extends Sender{

    @Override
    public Payment createPayment() {
        return new Paypal();
    }
}
