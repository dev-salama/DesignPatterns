/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author A
 */
public class Cricle implements shape {
    float raduis = 0.5f;
    @Override
    public void Draw() {
        System.out.println("Drawing Cricle...");
    }

    @Override
    public float clacArea() {
        return 3.14f*raduis*raduis;
    }
    
}
