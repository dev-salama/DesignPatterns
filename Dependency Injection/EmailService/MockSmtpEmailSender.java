/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmailService;

/**
 *
 * @author A
 */
public class MockSmtpEmailSender implements EmailSender {

    @Override
    public void SendEmail(String to, String subject, String body) {
        System.out.println("SMTP Success" );
    }    
}
