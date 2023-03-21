/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileReaderManger;

import java.io.FileNotFoundException;

/**
 *
 * @author A
 */
public class test {
    public static void main(String[] args) throws FileNotFoundException {
       FileReader fr = FileReader.getReader();
       fr.printFile("F:\\test.txt");
    }
}
