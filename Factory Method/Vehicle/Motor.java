/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicle;

/**
 *
 * @author A
 */
public class Motor implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Motor in drive mode.");
    }

    @Override
    public void goLoctaion(String location) {
        System.out.println("We arrive"+location+"by motor");
    }

    @Override
    public void stop() {
        System.out.println("Motor Stoped.");
    }
}
