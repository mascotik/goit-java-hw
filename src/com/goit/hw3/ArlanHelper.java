package com.goit.hw3;

public class ArlanHelper {
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }

    public String drawQuad(int n) {
        String result = "";
        int i =0;
        while (i++ < n) {
            int j = 0;
            while (j++ < n) {
                result += "*";
            }
            if (i != n)
                result += "\n";
        }
        return result;
    }
    public String drawRect(int width, int height, char c) {
        String result = "";
        int col = 0;
        while (col++ < height) {
            int row = 0;
            while (row++ < width) {
                result += c;
            }
            if (col != height)
                result += "\n";
        }
        return result;
    }

    // 39
    public String drawLine(int length) {
        boolean star = true;
        String result = "";
        int i = 0;
        while (i++ < length){

            if (star)
                result += "*";
            else
                result += "#";
            star = !star;
        }
        return result;
    }

    // 40
    public String drawPattern(char[] pattern, int repeatCount) {
        String result = "";

        int i = 0;
        while (i++ < repeatCount) {
            int j = 0;
            while (j++ < pattern.length) {
                result += pattern[j-1];
            }
        }
        return result;

    }
}
