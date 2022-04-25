package com.goit.hw4;

class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}

class Rectangle {
    int sideA;
    int sideB;
    public Rectangle(int a, int b) {
        sideA = a;
        sideB = b;
    }

    public boolean canPlaceInto(Rectangle anotherRect) {

        boolean canPlaceOne = sideA <= anotherRect.sideA && sideB <= anotherRect.sideB;
        boolean canPlaceTwo = sideA <= anotherRect.sideB && sideB <= anotherRect.sideA;

        return canPlaceOne || canPlaceTwo;
    }

}