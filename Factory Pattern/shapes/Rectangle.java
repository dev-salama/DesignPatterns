/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author A
 */
public class Rectangle implements shape {
    float width = 2.5f, height = 6.4f;
    @Override
    public void Draw() {
        System.out.println("Drawing Rectangle...");
    }
    @Override
    public float clacArea() {
        return width*height;
    }
}
