package com.goit.hw3;

import java.util.Arrays;

public class HarekDataMaker {
    public static void main(String[] args) {
        String[] names = new String[] {"hter", "pou", "diz"};
        int[] ages = new int[] {30, 35, 70};
        String[] planets = new String[] {"Mars", "Earth", "Jupiter"};

        HarekDataMaker harekDataMaker = new HarekDataMaker();

        System.out.println(harekDataMaker.aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]));
        System.out.println("###");

        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));

    }

    public String aggregateSingle(String name, String age, String planet) {
        return String.format("name - %s, age - %s, planet - %s",name,age,planet);
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        return new String[] {aggregateSingle(names[0], String.valueOf(ages[0]), planets[0]),
                aggregateSingle(names[1], String.valueOf(ages[1]), planets[1]),
                aggregateSingle(names[2], String.valueOf(ages[2]), planets[2])};
    }


}
