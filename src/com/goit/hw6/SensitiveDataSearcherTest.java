package com.goit.hw6;

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}

class SensitiveDataSearcher {
    private static final String SENSITIVE_WORDS = "pass key login email";

    public boolean isSensitiveDataPresent(String phrase) {
        String[] phraseArray = phrase.toLowerCase().split("[ :.,;]");

        for (String item : phraseArray) {
            if (SENSITIVE_WORDS.contains(item))
                return true;
        }
      return false;
    }
}