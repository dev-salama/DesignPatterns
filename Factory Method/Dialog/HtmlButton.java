/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dialog;

/**
 *
 * @author A
 */
public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<h1>Are you sure?</h1>");
        System.out.println("<button>Yes</button>");

    }

    @Override
    public void onClick() {
        System.out.println("Clicked!");
    }
    
}
