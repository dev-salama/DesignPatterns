/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Human;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 *
 * @author A
 */
public class Test {
    public static void main(String[] args) {
        /*
        Country palestine = new Country();
        City gaza = new City(palestine);
        Street rimalStreet = new Street(gaza);
        Address ahmedAddress = new Address(rimalStreet);
        Human ahmed = new Human(ahmedAddress);
        */
        Human ahmed = Guice.createInjector().getInstance(Human.class);
    }
}
