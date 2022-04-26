package com.goit.hw3;

// 44
public class ATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(2040));
    }

    public int countBanknotes(int sum) {
        int[] bankNotes = {500,200,100,50,20,10,5,2,1};
        int result = 0;
        int localSum = sum;

        int i = 0;
        while (localSum > 0) {
            while (localSum >= bankNotes[i]) {
                localSum -= bankNotes[i];
                result++;
            }
            i++;
        }
        return result;
    }
}
