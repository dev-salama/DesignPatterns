/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package News;

/**
 *
 * @author A
 */
public class Test {
    public static void main(String[] args) {
        NewsSource ns = new NewsSource();
        
        Aljzeera aj = new Aljzeera();
        BBC bbc = new BBC();
        RT rt = new RT();
        /*ns.setChannels(aj,bbc);*/
        ns.addChannel(aj);
        ns.addChannel(bbc);
        ns.addChannel(rt);

        ns.setNews("Gaza under attack", "2014/5/8");

    }
}
