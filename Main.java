package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println(array100());

    }

    public static String array100 (){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 10);
        //for (int i: arr)
           // System.out.println(i + " ");

        HashMap<Integer, Integer> d = new HashMap<>();
        Integer counter;
        for (int i = 0; i < arr.length; i++) {
            if (!d.containsKey(arr[i])) {
                counter = 1;
                d.put(arr[i], counter);
            } else {
                d.put(arr[i], d.get(arr[i]) + 1);
            }

        }
        for (Integer name : d.keySet()) {
            System.out.println(name + ": " + d.get(name));
        }

        return "";

    }


}








