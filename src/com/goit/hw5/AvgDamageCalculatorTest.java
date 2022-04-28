package com.goit.hw5;

class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
        int sum = 0;
        for(int sampleValue: samples) {
            sum += sampleValue;
        }

        int avgDamage;

        try {
            avgDamage = sum / samples.length;
        } catch (Exception e) {
            avgDamage = 0;
        }

        return avgDamage;
    }
}

class AvgDamageCalculatorTest {
    public static void main(String[] args) {
        //5
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}));

        //0
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));
    }
}
