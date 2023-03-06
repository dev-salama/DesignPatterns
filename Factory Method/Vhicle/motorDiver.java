/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vhicle;

/**
 *
 * @author A
 */
public class motorDiver {
    public void driveCar(String loaction){
        Motor myCar = new Motor();
        myCar.drive();
        myCar.goLoctaion(loaction);
        myCar.stop();
    } 
}
