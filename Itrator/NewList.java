/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Itrator3;

import java.util.Iterator;

/**
 *
 * @author A
 */
public class NewList<T> {
    private int Capacity = 100;
    private int Index = -1;
    private T[] items;
    
    public NewList(){
        items = (T[]) new Object[Capacity];
    }
    
    public void add(T item){
        if(Index<items.length-1){
            Index++;
            items[Index] =item;
        }
    }
    public void Remove(){
        /////
        items[Index] = null;
        Index--;
    }
    public Iterator<T> iterator(){
         Iterator<T> it = new Iterator<T>(){
             int iterIndex = -1;
             @Override
             public boolean hasNext() {
                 return iterIndex<Index;
             }

             @Override
             public T next() {
                 iterIndex++;
                 return items[iterIndex];
             }

         };
        return it;
    }
}
