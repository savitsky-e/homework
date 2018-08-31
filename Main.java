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
        s = s.replace(",","").replace(".","").replace("\n", "").replace("\r", "").replace("  ", " ").replace("?", "").replace("!", "");
        return s.toLowerCase();
    }
    public static int numberOfWords(String text) {
        String[] words = text.split(" ");
        return words.length;
    }

    public static String nuberOfRepeats (String text) {
        String[] words = text.split(" ");
        HashMap<String, Integer> d = new HashMap<>();
        Integer counter;
        for (int i = 0; i < words.length; i++) {
            if (! d.containsKey(words[i])) {
                counter = 1;
                d.put(words[i], counter);
            } else {
                d.put(words[i], d.get(words[i]) + 1);
            }
        }




        for (String name : d.keySet()) {
            System.out.println(name + ": " + d.get(name));
        }

        return "";
    }



}








