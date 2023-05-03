/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizza4;

/**
 *
 * @author A
 */
public abstract class Pizza {
    public final void preparePizza(){
        prepareBase();
        addElements();
        bakePizza();
    }
    
    abstract void prepareBase();
    abstract void addElements();
    abstract void bakePizza();
}
