/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author A
 */
public class SmartHome {
    // 1/Closed - 2/OnFinger - 3/OnPassword - 4/Opened 5/OnFingerPass

    private DoorMode CurrentMode;
    
    public void ExcuteMode(){
        this.CurrentMode.procces();
    }


    public void setCurrentMode(DoorMode CurrentMode) {
        this.CurrentMode = CurrentMode;
    }
    
}
