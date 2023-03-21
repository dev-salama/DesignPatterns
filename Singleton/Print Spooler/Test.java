/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printSpooler2;

/**
 *
 * @author A
 */
public class Test {
    public static void main(String[] args) {
        PrintSpooler myPrintSpooler = PrintSpooler.getSpooler();
        myPrintSpooler.setMessage("Hello");
        myPrintSpooler.Print();
    }
}
