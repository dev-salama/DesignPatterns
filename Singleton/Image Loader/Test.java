/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoadImage;

/**
 *
 * @author A
 */
public class Test {
    public static void main(String[] args) {
        ImageLoader myImageLoader = ImageLoader.getLoader();
        myImageLoader.loadImage("image.png");
    }
}
