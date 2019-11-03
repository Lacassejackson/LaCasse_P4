package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main<remove> {

    public static void main(String[] args) throws Exception  {
        String dataFile = new Scanner(new File("C:\\Program\\problem1.txt")).useDelimiter("\\Z").next();
        //System.out.println(dataFile);
       remove(dataFile);
      // write(dataFile);
    }

    public static String remove(String dataFile) throws IOException {
        //String dataFile = new Scanner(new File("C:\\Program\\problem1.txt")).useDelimiter("\\Z").next();

        String[] listOfWords = dataFile.split(" ");


        ArrayList<String> filteredWords = new ArrayList<String>();
        for (String word : listOfWords) {
            if (!filteredWords.contains(word)){
                filteredWords.add(word);

                String filteredString = String.join(" ", filteredWords);
                try (PrintWriter out = new PrintWriter("C:\\Program\\unique_words.txt")) {
                    out.println(filteredString);
                    out.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
        return(dataFile);
    }

    public static String write(String uniqueWords) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Program\\unique_words.txt"));
        writer.write(uniqueWords);
        writer.close();
        return (uniqueWords);
    }

}
