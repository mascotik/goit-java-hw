package com.goit.hw5;

class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}

class CircleIntersector {
    private final int x1;
    private final int y1;
    private final int r1;
    private final int x2;
    private final int y2;
    private final int r2;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        this.x1 = x1;
        this.y1 = y1;
        this.r1 = r1;
        this.x2 = x2;
        this.y2 = y2;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        if (r1 + r2 >= getDistance()) {
            return  "intersects";
        } else {
            return  "not intersects";
        }
    }

    public double getDistance() {
        int sideX = Math.abs(x1 - x2);
        int sideY = Math.abs(y1 - y2);
        double length = Math.pow(sideX,2) + Math.pow(sideY,2);
        return Math.sqrt(length);
    }
}