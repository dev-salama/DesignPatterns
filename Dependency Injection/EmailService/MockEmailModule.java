/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmailService;

import com.google.inject.AbstractModule;

/**
 *
 * @author A
 */
public class MockEmailModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(EmailSender.class).to(MockSmtpEmailSender.class);
    }
}
