/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

import java.util.Scanner;

/**
 *
 * @author A
 */
public class test {
    public static void main(String[] args){
        System.out.println("Enter:");
        System.out.println("1 to draw cricle");
        System.out.println(", 2 to draw Rectangle");
        System.out.println("or 3 to draw Square");

        Scanner s = new Scanner(System.in);
        int type = s.nextInt();
        
        shape shape = Factory.createShape(type);
        shape.Draw();
        System.out.println(shape.clacArea());
    }
}
