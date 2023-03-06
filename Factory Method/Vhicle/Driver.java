/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vhicle;

/**
 *
 * @author A
 */
public abstract class Driver {
    public void driveVhicle(String loaction){
        Vhicle myVhicle = createVhicle();
        myVhicle.drive();
        myVhicle.goLoctaion(loaction);
        myVhicle.stop();
    } 
    public abstract Vhicle createVhicle();
}
