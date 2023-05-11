/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package News3;

/**
 *
 * @author A
 */
public class Test {
    public static void main(String[] args) {
        Aljzeera aj = new Aljzeera();
        BBC bbc = new BBC();
        CNN cnn = new CNN();
        DataBus dataBus = DataBus.getInstance();
        dataBus.Subscribe(aj);
        dataBus.Subscribe(bbc);
        dataBus.Subscribe(cnn);
        
        aj.sendNews("Hello");
        cnn.sendNews("Gaza under attack");

    }
}
