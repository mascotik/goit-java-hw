package com.goit.hw6;

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}

class PalindromeCounter {

    public int count(String phrase) {
        int result = 0;
        String[] words = phrase.toLowerCase().split(" ");
        for (String word : words) {
            int i = (word.length() / 2);
            boolean isPalindrome = true;
            for (int j = 0; j < i; j++) {
                if (word.charAt(j) != word.charAt((word.length() - 1) - j)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome)
                result++;
        }
        return result;
    }
}