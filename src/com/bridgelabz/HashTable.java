package com.bridgelabz;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Welcome to hashtable program ");
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        String message = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] messageArray = message.toLowerCase().split(" ");

        for (String word : messageArray){
            Integer value = hashtable.get(word);

            if (value == null)
                value = 1;
            else
                value = value + 1;
            hashtable.put(word, value);
        }
        System.out.println(hashtable);

    }
}
