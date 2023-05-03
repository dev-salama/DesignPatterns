/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizza4;

/**
 *
 * @author A
 */
public class ChickenPizza extends Pizza{

    @Override
    void prepareBase() {
        System.out.println("Preparing base for chicken pizza ..");
    }

    @Override
    void addElements() {
        System.out.println("Adding elements for chicken pizza");
    }

    @Override
    void bakePizza() {
        System.out.println("Baking chicken pizza ..");
    }

}
