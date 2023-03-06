/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author A
 */
public class Square implements shape {
    float x = 5.2f;
    @Override
    public void Draw() {
        System.out.println("Drawing Square...");
    }
    @Override
    public float clacArea() {
        return x*x;
    }
}
