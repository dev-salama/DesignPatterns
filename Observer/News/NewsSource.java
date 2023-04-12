/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package News;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A
 */
public class NewsSource {
    private String News;
    private String Date;
    private List<Channel> channels = new ArrayList<>();
    
    public void addChannel(Channel c){
        if(!channels.contains(c))
            channels.add(c);
        else
            System.out.println("The channel is already exit");
    }
    public void removeChannel(Channel c){
        channels.remove(c);
    }
    
    public void setNews(String N, String D){
        this.News = N;
        this.Date = D;
        Display();
        for(Channel c : channels)
            c.updateNews(N, D);
    }
    
    public void Display(){
        System.out.println(Date+" : "+News);
    }
}
