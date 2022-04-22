package com.goit.hw3;

public class TriangleDrawer {
    public static void main(String[] args) {

        TriangleDrawer triang = new TriangleDrawer();
        System.out.println(triang.drawTriangle(5));
    }

    public String drawTriangle(int side) {
        String result = "";

        int i = 0;
        while (i++ <= side) {
            int j = i;
            while (j++ <= side) {
                result += "*";
            }
            if (i != side) {
                result += "\n";
            }
        }

        return result;
    }
}
