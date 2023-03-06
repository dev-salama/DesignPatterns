/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicle;

/**
 *
 * @author A
 */
public class Car implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Car in drive mode.");
    }

    @Override
    public void goLoctaion(String location) {
        System.out.println("We arrive"+location+"by car");
    }

    @Override
    public void stop() {
        System.out.println("Car Stoped.");
    }
    
}
