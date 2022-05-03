package com.goit.hw6;

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}

class PunctuationMarkCounter {
    private final static String regExpString = ".,!:;";

    public int count(String phrase) {

        return (int)phrase.chars().filter(ch -> regExpString.contains(String.valueOf((char)ch))).count();
    }
}