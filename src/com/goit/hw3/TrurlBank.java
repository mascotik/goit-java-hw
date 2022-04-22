package com.goit.hw3;
public class TrurlBank {
    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(99));
    }

    // 42
    public int sumQuads(int n) {
        int result = 0;

        int i = n;
        while (i > 0) {
            result += i*i;
            i--;
        }
        return result;
    }

    // 43
    public int countSumOfDigits(int number) {
       int result = 0;
       String numberStr = String.valueOf(number);

       int i = 0;
       while (i < numberStr.length()) {
           result += Integer.parseInt(numberStr.substring(i,i+1));
           i++;
       }
       return result;
    }
}