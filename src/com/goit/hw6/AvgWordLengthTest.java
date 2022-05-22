package com.goit.hw6;

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}

class AvgWordLength {

    public double count(String phrase) {
        double countWords = 0.0;

        String[] words = phrase.split(" ");

        for (String word : words) countWords += word.length();
        return countWords / (words.length);
    }
}