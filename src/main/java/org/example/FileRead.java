package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {

        String filePath="C:\\Week3Day4\\src\\main\\java\\org\\example\\sample.txt";
        try(FileReader fr = new FileReader(filePath);
                BufferedReader br=new BufferedReader(fr)){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
