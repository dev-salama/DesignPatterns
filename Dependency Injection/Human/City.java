/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Human;

import com.google.inject.Inject;

/**
 *
 * @author A
 */
public class City {
    Country country;
    
    @Inject
    public City(Country c){
        this.country = c;
    }
}
