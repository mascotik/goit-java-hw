package com.goit.hw4;

class PlanetTester {
    public static void main(String[] args) {
        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars())); //Should be true
        System.out.println(tester.test(new Moon())); //Should be false
    }

    String test(SpaceObject object) {
        return object instanceof Planet ? "planet" : "not planet";
    }
}

abstract class SpaceObject {

}

abstract class Planet extends SpaceObject {

}

class Mars extends Planet {

}

class Moon extends SpaceObject {

}