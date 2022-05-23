package com.goit.hw6;

import java.util.regex.Pattern;

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}

class EmailDetector {

    public boolean isPresent(String text) {
        return Pattern.compile("[a-z]{2}@[a-z]{2}").matcher(text.toLowerCase()).find();
    }
}