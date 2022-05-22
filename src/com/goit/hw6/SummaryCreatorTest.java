package com.goit.hw6;

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "ezijuqpujoexbio p";
        System.out.println(summaryCreator.create(longPhrase));
    }
}

class SummaryCreator {

    public String create(String text) {
        if (text.length() <= 15)
            return text;
        String result = text.substring(0,15);
        if (text.charAt(15) != ' ')
            result += "...";
        return result;
    }
}

