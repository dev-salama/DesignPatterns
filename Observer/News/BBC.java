/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package News;

/**
 *
 * @author A
 */
public class BBC implements Channel{
    private String News;
    private String Date;
    
    public void updateNews(String N, String D){
        this.News = N;
        this.Date = D;
        Display();
    }
    public void Display(){
        System.out.println("BBC news///// " + Date+" : "+News);
    }
}
