package com.goit.hw6;

import java.util.Arrays;

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}

class WordSplitter {
    public String[] split(String phrase) {
        return phrase.toLowerCase().trim().split("\\s+");
    }
}