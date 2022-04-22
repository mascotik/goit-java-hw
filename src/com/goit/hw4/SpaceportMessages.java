package com.goit.hw4;

public class SpaceportMessages {
    public static String generateLandingMessage(String shipName, String spaceport, String time) {
        return String.format("Spaceship %s landing at %s, time is %s",shipName,spaceport,time);
    }
}
