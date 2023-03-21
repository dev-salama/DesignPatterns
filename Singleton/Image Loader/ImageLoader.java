/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoadImage;

/**
 *
 * @author A
 */
public class ImageLoader {
    private ImageLoader(){}
    private static ImageLoader Loader = null;
    public static ImageLoader getLoader(){
        if(Loader == null){
            Loader = new ImageLoader();
        }
        return Loader;
    }
    public void loadImage(String imageName){
        System.out.println(imageName +" Loading..");
    }
}
