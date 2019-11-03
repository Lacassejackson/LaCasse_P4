package com.company;

import java.io.*;
import java.util.Scanner;
public class Main<remove> {

    public static void main(String[] args) throws Exception  {
        String dataFile = new Scanner(new File("C:\\Program\\problem2.txt")).useDelimiter("\\Z").next();
        int uniqueWords = 0;
        System.out.println(dataFile);

         count(dataFile, uniqueWords);
         write(uniqueWords);
    }

    public static int count(String dataFile,int uniqueWords) throws IOException {
        String[] words=dataFile.split(" ");
        int wordCounter = 1;
        for(int i = 0; i <words.length;i++){

            for(int j = i + 1;j < words.length;j++){

                if(words[i].equals(words[j])){
                    wordCounter = wordCounter +1;
                }
            }
        }
        wordCounter = uniqueWords;
        // System.out.println(words);
        return(uniqueWords);
    }

    public static String write(int uniqueWords) throws IOException {
        String uniqueWordsOutput = Integer.toString(uniqueWords);
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Program\\unique_word_countse.txt"));
        writer.write(uniqueWordsOutput);
        writer.close();
        return (uniqueWordsOutput);
    }

}
