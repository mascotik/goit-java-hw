package com.goit.hw6;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

class DigitExtracter {

    public int[] extract(String text) {
        int[] result = {};
        Pattern pattern = Pattern.compile("[\\d]");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            result = Arrays.copyOf(result,result.length+1);
            result[result.length-1] = Integer.parseInt(matcher.group());
        }
        return result;
    }
}