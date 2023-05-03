/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataminer;

/**
 *
 * @author A
 */
public abstract class DataMiner {
    public final String[] mine(String path){
        String file = openFile(path);
        String[] extractedData = extractData(file);
        String[] parsedData = parseData(extractedData);
        closeFile();
        return parsedData;
    }
    public abstract String openFile(String path);
    public abstract String[] extractData(String file);
    public abstract String[] parseData(String[] extractedData);
    public abstract void closeFile();
    
    
}
