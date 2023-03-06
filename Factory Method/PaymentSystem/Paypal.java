/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaymentSystem;

/**
 *
 * @author A
 */
public class Paypal implements Payment {

    @Override
    public void doPayment(float amount, int from, int to) {
        System.out.println("Sending " + amount +"from"+ from +"to"+to+"by paypal");
    }

    @Override
    public void sendConifrmation() {
        System.out.println("Paypal payment sent.");
    }
    
}
