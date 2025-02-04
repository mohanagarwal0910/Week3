package org.example;

import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter("C:\\\\Week3Day4\\\\src\\\\main\\\\java\\\\org\\\\example\\\\sample.txt", true)){

            System.out.println("Enter text to write to file (type 'exit' to stop):");
            String line;

            while (true) {
                line = br.readLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                fw.write(line+System.lineSeparator());
            }
            System.out.println("Input saved to output.txt");
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


    }
}