/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmailService;

/**
 *
 * @author A
 */
public class SmtpEmailSender implements EmailSender {

    @Override
    public void SendEmail(String to, String subject, String body) {
        System.out.println("SMTP Sending email to: "+to+" with sunject: "+subject+" and body: "+body);
    }    
    
}
