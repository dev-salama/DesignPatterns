/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vhicle;

/**
 *
 * @author A
 */
public class Bus implements Vhicle{

    @Override
    public void drive() {
        System.out.println("Bus in drive mode.");
    }

    @Override
    public void goLoctaion(String location) {
        System.out.println("We arrive"+location+"by bus");
    }

    @Override
    public void stop() {
        System.out.println("Bus Stoped.");
    }
}
