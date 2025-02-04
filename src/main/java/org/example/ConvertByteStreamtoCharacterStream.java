package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ConvertByteStreamtoCharacterStream {
    public static void main(String[] args) {
        String filePath = "C:\\Week3Day4\\src\\main\\java\\org\\example\\sample.txt";

        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
