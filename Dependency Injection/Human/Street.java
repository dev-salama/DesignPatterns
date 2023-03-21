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
public class Street {
    City city;
    
    @Inject
    public Street(City cy){
        this.city = cy;
    }
}
