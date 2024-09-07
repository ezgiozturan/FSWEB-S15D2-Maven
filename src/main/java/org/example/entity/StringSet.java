package org.example.entity;

import java.util.Set;
import java.util.TreeSet;


public class StringSet {

    public static String text;


public static Set<String> findUniqueWords() {
     text  =  text.replaceAll("[.,!?\"—]", "");

    String[] words = text.split("\\s+");

    Set<String> uniqueWords = new TreeSet<>();

    for (String word :words) {
        uniqueWords.add(word.toLowerCase());
    }
    return uniqueWords;
}








}
