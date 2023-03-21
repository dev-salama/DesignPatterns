/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printSpooler2;

/**
 *
 * @author A
 */
public class PrintSpooler {
    private PrintSpooler(){}
    private String Message;
    private static PrintSpooler Spooler = null;
    public static synchronized PrintSpooler getSpooler(){
        if(Spooler == null)
            Spooler = new PrintSpooler();
        return Spooler;
    }

    /**
     * @param Message the Message to set
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }
    
    public void Print(){
        if(Message != null)
            System.out.println("Printing: " + Message);
        else
            throw new IllegalArgumentException("First, Set Message.");
    }


}
