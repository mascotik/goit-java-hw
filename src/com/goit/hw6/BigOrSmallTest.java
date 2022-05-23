package com.goit.hw6;

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}

class BigOrSmall {

    public String calculate(String text) {
        int countLow = 0;
        int countUp = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == text.toLowerCase().charAt(i)) {
                countLow++;
                continue;
            }

            if (text.charAt(i) == text.toUpperCase().charAt(i)) {
                countUp++;
            }
        }

        if (countLow > countUp)
            return "Small";
        if (countLow < countUp)
            return  "Big";

        return "Same";
    }
}