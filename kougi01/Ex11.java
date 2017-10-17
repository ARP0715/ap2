/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f1 = new File("text.txt");
        System.out.println("FileName: " + f1.getName());
        System.out.println("AbsolutePath: " + f1.getAbsolutePath());
        System.out.println("Size: " + f1.length() + " bite");

        File inFile = new File("test.txt");
        FileReader fr = new FileReader(inFile);
        try (BufferedReader br = new BufferedReader(fr)) {
            String line;
            while((line = br.readLine()) !=null){
                System.out.println(line);
            }
        }
        }
// TODO code application logic here
    }


