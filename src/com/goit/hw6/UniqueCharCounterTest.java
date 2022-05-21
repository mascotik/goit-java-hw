package com.goit.hw6;

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}

class UniqueCharCounter {

    public int count(String phrase) {
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {

            Character nextChar = phrase.charAt(i);
            if (!uniqueChars.toString().contains(nextChar.toString()))
                uniqueChars.append(nextChar);
        }
        return uniqueChars.length();
    }
}