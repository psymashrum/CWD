/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CWD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.in;
import java.util.ArrayList;

/**
 *
 * @author aelkin
 */
public class create {

//Мелкие переменные
    private static String fileName = ("/Users/aelkin/Desktop/AD.csv");

//Класс присутствия файла
    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList <String> text = read(fileName);
        System.out.print(text);
    }

    //public static 
//Класс чтение файла
    public static ArrayList <String> read(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        exists(fileName);
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(fileName)));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append(",");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
        ArrayList users = new ArrayList <String>();
        String[] study = sb.toString().split(",");
        for (String x : study) {
            System.out.println(x);
            
            users.add(x+"\n");
        }
        return users;
    }

}
