/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author A
 */
public class Factory {
    public static shape createShape(int choice){
        shape myShape = null;
        if(choice == 1){
            myShape = new Cricle();
        }else if(choice == 2){
            myShape = new Rectangle();
        }else if(choice == 3){
            myShape = new Square();
        }else{
            throw new IllegalArgumentException("Invalid Choice.");
        }
        return myShape;
        
    }
}
