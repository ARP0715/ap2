/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Kadai02_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Cat> tlist = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("data2.csv")));

            String line;
            while ((line = br.readLine()) != null) {
                Cat cat = new Cat();
                String[] word = line.split(",");
                cat.setNo(Integer.parseInt(word[0]));
                cat.setName(word[1]);
                cat.setKind(word[2]);
                
                cat.setAge(Integer.parseInt(word[6]));
                cat.setWeight(Double.parseDouble(word[7]));

                tlist.add(cat);

            }
            br.close();
            for (Cat cat : tlist) {
                cat.printCat();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
