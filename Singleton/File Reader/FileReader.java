/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileReaderManger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author A
 */
public class FileReader {
    
    // private constructor
    private FileReader () {};
    private static FileReader Instance = null;
    
//singelton part    
    public static FileReader getReader(){
    if(Instance == null)
        Instance = new FileReader();    
    return Instance;
    }

//    readfile method
       public void printFile(String path) throws FileNotFoundException{
           File text = new File(path);
           Scanner s = new Scanner(text);
           
           while(s.hasNextLine()){
               System.out.println(s.nextLine());
           }
       }
    
}
