package com.goit.hw4;

import java.util.Arrays;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int[] result = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        double minDist = Double.MAX_VALUE;

        for (int[] target : targets) {
            double dist = getDistance(aiCoords, target);
            if (dist < minDist) {
                result = target;
                minDist = dist;
            }
        }

        return result;
    }

    public double getDistance(int[] p1, int[] p2) {
        int sideX = Math.abs(p1[0] - p2[0]);
        int sideY = Math.abs(p1[1] - p2[1]);
        double length = Math.pow(sideX,2) + Math.pow(sideY,2);
        return Math.round(Math.sqrt(length));
    }
}