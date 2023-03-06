/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vhicle;

/**
 *
 * @author A
 */
public class carDriver extends Driver{

    @Override
    public Vhicle createVhicle() {
        return new Car();
    }
    
}
