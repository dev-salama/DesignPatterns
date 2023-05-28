/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Itrator3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author A
 */
public class Itrator {
    public static void main(String[] args) {
        NewList<String> Names = new NewList<>();
        Names.add("Ahmed");
        Names.add("Mohammed");
        Names.add("Omar");

        Iterator<String> itr = Names.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        
    }
}
