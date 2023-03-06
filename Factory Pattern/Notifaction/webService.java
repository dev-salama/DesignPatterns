/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notifaction;

import java.util.Scanner;

/**
 *
 * @author A
 */
public class webService {
    public static void main(String[] args){
        System.out.println("Enter"); 
        System.out.println("1 to Send SMS");    
        System.out.println("Or 2 to Send Email");    

        Scanner s = new Scanner(System.in);
        int type = s.nextInt();
        
        Notifaction myNotifaction = Factory.createNotifaction(type);
        myNotifaction.notifyUser();
    }
}
