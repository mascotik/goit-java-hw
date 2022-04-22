package com.goit.hw5;

class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
        this(hp);
        this.name = name;
    }

    public Hero(int hp) {
        int checkHp = hp;
        if (checkHp < 0) checkHp = 0;
        if (checkHp > 200) checkHp = 200;
        this.hp = checkHp;
    }

    public Hero() {
        this("Paratrooper", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", -86);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}