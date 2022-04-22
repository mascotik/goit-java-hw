package com.goit.hw5;

class Bullet {
    static {
        System.out.println("Bullet created!");
    }
}

class BulletTest {
    public static void main(String[] args) {
        new Bullet();
        new Bullet();
    }
}