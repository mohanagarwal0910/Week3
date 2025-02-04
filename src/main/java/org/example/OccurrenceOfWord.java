package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OccurrenceOfWord {
    public static void main(String[] args) {
        String filePath = "C:\\Week3Day4\\src\\main\\java\\org\\example\\sample.txt";
        try(FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr)){
            String line;
            String target="Hello";
            int count=0;
            while ((line = br.readLine()) != null) {
                String words[]=line.split(" ");
                for(int i=0;i<words.length;i++){
                    if(words[i].equals(target))
                        count++;
                }
            }
            System.out.println(count);
        }
        catch(IOException e){
            e.printStackTrace();
        }


    }
}
