/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dialog;

/**
 *
 * @author A
 */
public abstract class Dialog {
    public void createDialog(){
        Button myButton = createButton();
        myButton.render();
    }
    
    public abstract Button createButton();
}
