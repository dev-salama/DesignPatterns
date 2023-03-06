/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dialog;

/**
 *
 * @author A
 */
public class Test {
    public static void main(String[] args) {
        Dialog myDialog = null;
        if(System.getProperty("os.name").equals("Windows 11")){
            myDialog = new WindowsDialog();
        }else{
            myDialog = new HtmlDialog();
        }
        myDialog.createDialog();

    }
}
