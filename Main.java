package com.company;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;
import  java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(nuberOfRepeats(getText()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Number of words in file: " + numberOfWords(getText()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String getText () throws FileNotFoundException {
        String s = "";
        Scanner in = new Scanner(new File("d:\\1.txt"));
        while (in.hasNext())
        s += in.nextLine() + "\r\n";
        in.close();
        s = s.replace(",","").replace(".","").replace("\n", "").replace("  ", " ").replace("?", "").replace("!", "");
        return s.toLowerCase();
    }
    public static int numberOfWords(String text) {
        String[] words = text.split(" ");
        for (int i=0; i<words.length; i++)
            System.out.println(words[i]);
        return words.length;
    }

    public static String nuberOfRepeats (String text) {
        String[] words = text.split(" ");
        HashMap<String, Integer> d = new HashMap<>();
        Integer counter;
        for (int i = 0; i < words.length; i++) {
            if (! d.containsKey((words))) {
                counter = 1;
                for (int j = 0; j < words.length; j++) {
                    if (words[i].equals(words[j]) && i!=j)
                        counter++;
                    System.out.println(counter);
                    d.put(words[i], counter);
                    }
                }
            }




        for (String name : d.keySet()) {
            System.out.println(name + ": " + d.get(name));
        }

        return "";
    }



    }








