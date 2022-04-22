package com.goit.hw4;

class Stars {
    private int count;

    @Override
    public String toString() {
        String result = "";
        int x = 1000;
        int y = 100;
        int z = 10;
        int star = 1;
        int endCount = count;

        while (endCount > 0) {
            if (endCount >= x) {
                result += "X";
                endCount -= x;
                continue;
            }
            if (endCount >= y) {
                result += "Y";
                endCount -= y;
                continue;
            }
            if (endCount >= z) {
                result += "Z";
                endCount -= z;
                continue;
            }
            if (endCount >= star) {
                result += "*";
                endCount -= star;
                continue;
            }
        }


        return result;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}
