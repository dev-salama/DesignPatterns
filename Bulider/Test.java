/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bulider;

/**
 *
 * @author A
 */
public class Test {
    public static void main(String[] args) {
        Car.Bulider myBulider = new Car.Bulider();
        myBulider.setColor("Blue");
        myBulider.setModel("kia");
        myBulider.setPrice(15300f);
        myBulider.createCar();
    }
}
