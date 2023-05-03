/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataminer;

/**
 *
 * @author A
 */
public class DocMiner extends DataMiner{
   
   
    @Override
    public String openFile(String path) {
        System.out.println("Opening file: " + path);
        return path;
    }

    @Override
    public String[] extractData(String file) {
        System.out.println("Extract Data From File: " + file);
        String[] extractedData = {"text","text"};
        return extractedData;
    }

    @Override
    public String[] parseData(String[] extractedData) {
        System.out.println("Parse Data From File: " + extractedData);
        String[] paresedData = {"paresed text","paresed text"};
        return paresedData;
    }

    @Override
    public void closeFile() {
        System.out.println("Closing File .. ");
    }
    
}
