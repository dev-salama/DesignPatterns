/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author A
 */
public class test {
    public static void main(String[] args) {
        SmartHome myHome = new SmartHome();
        Opened o = new Opened();
        Closed c = new Closed();
        OnFinger of = new OnFinger();
        OnFingerPass ofp = new OnFingerPass();
        myHome.setCurrentMode(ofp);
        myHome.ExcuteMode();
    }
}
