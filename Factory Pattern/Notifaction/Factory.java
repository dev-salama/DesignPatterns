/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notifaction;

/**
 *
 * @author A
 */
public class Factory {
    public static Notifaction createNotifaction(int type){
        Notifaction myNotifaction = null;
        if(type == 1){
            myNotifaction = new SmsNotifaction();
        }else if(type == 2){
            myNotifaction = new EmailNotifaction();
        }else{
            throw new IllegalArgumentException("Invalid input.");
        }
        return myNotifaction;
    }
}
