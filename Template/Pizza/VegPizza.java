/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizza4;

/**
 *
 * @author A
 */
public class VegPizza  extends Pizza{

    @Override
    void prepareBase() {
        System.out.println("Preparing base for veg pizza ..");
    }

    @Override
    void addElements() {
        System.out.println("Adding elements for veg pizza");
    }

    @Override
    void bakePizza() {
        System.out.println("Baking veg pizza ..");
    }
}
