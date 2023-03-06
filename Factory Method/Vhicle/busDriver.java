/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vhicle;

/**
 *
 * @author A
 */
public class busDriver {
    public void driveCar(String loaction){
        Bus myCar = new Bus();
        myCar.drive();
        myCar.goLoctaion(loaction);
        myCar.stop();
    } 
}
