package com.goit.hw6;

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("22 - 2 =g"));

        //false
        System.out.println(new MathDetector().isMath("22 + a = q"));

        //false
        //System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}


class MathDetector {

    public boolean isMath(String text) {
        boolean isEquals = text.contains("=");
        boolean isOperator = text.matches(".*[\\-+*/].*");
        boolean isTwoNumbers = text.split("\\d+").length > 2;

        return isEquals && isOperator && isTwoNumbers;
    }
}