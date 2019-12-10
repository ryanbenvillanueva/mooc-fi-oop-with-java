/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ryan Ben
 */
public class Analysis {
    
    private File file;
    
    public Analysis(File file) {
        this.file = file;
    }
    
    public int lines() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        int lineCount = 0;
        
        while (reader.hasNextLine()) {
            lineCount +=1;
            reader.nextLine();
        }
        
        return lineCount;
    }
    
    public int characters() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        int characterCount = 0;
        
        while (reader.hasNext()) {
            String line = reader.nextLine();
            
            characterCount += line.length() + 1;
        }
        
        return characterCount;
    }
}
