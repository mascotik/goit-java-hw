package com.goit.hw6;

import java.util.Arrays;

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("ixgo cag qum assevalyu he qum udjoedhipov ganufi qiba qum gyj nuisjus zalug", "qum" ));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}

class WordFreqCounter {

    public float countFreq(String phrase, String word) {
        float countWord = 0;
        float countPhrase = 1;
        int length = 1;

        int index = 0;
        while( (index = phrase.indexOf(" ", index)) != -1 ) {
            index += length;
            countPhrase++;
        }
        index = 0;
        length = word.length();
        while( (index = phrase.toLowerCase().indexOf(word.toLowerCase(), index)) != -1 ) {
            index += length;
            countWord++;
        }
        return (countWord / countPhrase);
    }
}