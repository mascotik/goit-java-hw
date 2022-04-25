package com.goit.hw5;

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

class RectangleArea {

    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    public RectangleArea(int[] coords) {
        this.startX = coords[0];
        this.startY = coords[1];
        this.endX = coords[2];
        this.endY = coords[3];
    }

    public int getArea() {
        int sideX = Math.abs(endX - startX);
        int sideY = Math.abs(endY - startY);

        return sideX * sideY;
    }

}
