/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Kadai02_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Cat> tlist = new ArrayList<>();
        int num = 0;
        double weight = 0;
        double age = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("data2.csv")));

            String line;
            while ((line = br.readLine()) != null) {
                Cat cat = new Cat();
                String[] word = line.split(",");
                cat.setAge(Integer.parseInt(word[6]));
                cat.setWeight(Double.parseDouble(word[7]));
                
                 tlist.add(cat);
                weight += Double.parseDouble(word[7]);
                age += Double.parseDouble(word[6]);
                num += 1;
            }
            br.close();
            for (Cat cat : tlist) {
               
            }
            weight = weight / num;
            age = age / num;
            System.out.printf("登録されているネコの平均体重は %.2fkg です。\n", weight);
            System.out.printf("登録されているネコの平均体重は%.2f才です。\n", age);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

