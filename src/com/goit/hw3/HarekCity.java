package com.goit.hw3;

import java.util.*;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public static void main(String[] args) {
        int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
        HarekCity h = new HarekCity();
        h.printKeyboard();
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        int[] ageArray = {age1,age2,age3,age4};
        return ageArray;
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[names.length-1] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String first = results[0];
        int length = results.length-1;
        results[0] = results[length];
        results[length] = first;
    }

    public String[] changeElectResultAgain(String[] results) {

        return Arrays.copyOfRange(results,3,results.length-1);
    }

    public char[][] createKeyboard() {
        return new char[][] {{'1', '2', '3'},{'4', '5', '6'},{'7', '8', '9'},{'*', '0', '#'}};
    }

    public void printKeyboard() {
        char[][] keyboard = createKeyboard();
        for (int i = 0; i < keyboard.length; i++) {
            System.out.println(Arrays.toString(keyboard[i]));
        }
    }
    public String[] makeCopy(String[] names) {
        System.out.println("Copied!");
        return Arrays.copyOf(names,names.length);
    }
}