/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmailService;

import com.google.inject.Inject;

/**
 *
 * @author A
 */
public class EmailService {
    EmailSender emailSender;
    
    @Inject
    public EmailService(EmailSender e){
        this.emailSender = e;
    }
}
