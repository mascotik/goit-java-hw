package com.goit.hw4;

public class SpaceUtils {
    public static final int PLANET_COUNT = 8;
    public static final String HOME_PLANET_NAME = "Earth";
    public static final String HOME_STAR_NAME = "Sun";

    public static String pluralPlanets(int planetCount) {
        return planetCount + (planetCount == 1 ? " planet " : " planets ");
    }

    public static String generateStartMessage(String shipName, String time) {
        return String.format("Ship %s start at %s",shipName,time);
    }
}
