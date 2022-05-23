package com.goit.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}

class NameCounter {

    public int count(String text) {
        int counter = 0;

        Matcher matcher = Pattern.compile("[A-Z][a-z]+").matcher(text);

        while (matcher.find()) counter++;

        return counter;
    }
}