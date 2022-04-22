package com.goit.hw5;

class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}

class Distance {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance() {
        int sideX = endX - startX;
        int sideY = endY - startY;
        double lenght = Math.pow(sideX,2) + Math.pow(sideY,2);
        return (int)Math.round(Math.sqrt(lenght));

    }
}