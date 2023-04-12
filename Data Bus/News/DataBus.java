/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package News3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A
 */
public class DataBus {
    List<Subscriber> Subscribers = new ArrayList<>();

    
    //Subscribe and UnSubscribe Methods
    public void Subscribe(Subscriber s){
        if(!Subscribers.contains(s))
            Subscribers.add(s);
    }
    public void UnSubscribe(Subscriber s){
        if(Subscribers.contains(s))
            Subscribers.remove(s);
    }
    
    //Singleton
    private DataBus(){}
    private static DataBus instance = null;
    public static DataBus getInstance(){
        if(instance == null)
            instance = new DataBus();
        return instance;
    }
    
    public static class News{
        private String News;
        private Subscriber Sender;

        public News(String News, Subscriber Sender) {
            this.News = News;
            this.Sender = Sender;
        }

        /**
         * @return the News
         */
        public String getNews() {
            return News;
        }

        /**
         * @return the Sender
         */
        public Subscriber getSender() {
            return Sender;
        }
        
    }
    public void publish(News n){
        Subscriber sender = n.getSender();
        for(Subscriber s : Subscribers)
            if(s != sender)
                s.reciveNews(n);
    }
    
    interface Subscriber{
        default void reciveNews(News n){
            System.out.println(this.getClass().getSimpleName()+" recived news: "+n.getNews()+" from: "+n.getSender().getClass().getSimpleName());
        };
        default void sendNews(String ns){
            DataBus.News n = new DataBus.News(ns,this);
            DataBus.getInstance().publish(n); 
        };
    }
}
