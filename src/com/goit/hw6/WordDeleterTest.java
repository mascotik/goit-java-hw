package com.goit.hw6;

import java.util.Arrays;

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}

class WordDeleter{

    public String remove(String phrase, String[] words) {
        String result = "";
        String[] splitPhrase = phrase.split(" ");
        String stringWords = Arrays.toString(words);

        for (String item : splitPhrase) {
            if (!stringWords.contains(item))
                result += item + " ";
        }

        return  result.trim();
    }
}