package com.company;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class duplicateRemover {

    public static void main(String[] args) throws Exception  {
        String dataFile = new Scanner(new File("C:\\Program\\problem1.txt")).useDelimiter("\\Z").next();
        remove(dataFile);
        write(dataFile);

    }
    public static String remove(String dataFile){
        //String dataFile = new Scanner(new File("C:\\Program\\problem1.txt")).useDelimiter("\\Z").next();
        System.out.println(dataFile);
        return(dataFile);
    }

    public static String write(String uniqueWords) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Program\\outputFile.txt"));
        writer.write(uniqueWords);
        writer.close();
        return (uniqueWords);
    }
}
