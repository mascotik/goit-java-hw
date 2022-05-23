package com.goit.hw6;

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}

class WordCombine {

    public boolean canCombine(String sourceWord, String targetWord) {
        String source = sourceWord.toLowerCase();
        String target = targetWord.toLowerCase();

        for (int i = 0; i < target.length(); i++) {
            String findString = target.substring(i,i+1);
            if (!source.contains(findString))
                return false;
        }
        return  true;
    }
}