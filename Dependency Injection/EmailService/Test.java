/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmailService;

import com.google.inject.Guice;

/**
 *
 * @author A
 */
public class Test {
    public static void main(String[] args) {
        EmailService myEmailService = Guice.createInjector(new EmailModule()).getInstance(EmailService.class);
        myEmailService.emailSender.SendEmail("to@test.co", "Hello", "Hello, How are you?");
    }
}
