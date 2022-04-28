package com.goit.hw5;

class LevelLoaderTest {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
    }
}

class LevelLoader {

    private static final LevelLoader instance = new LevelLoader();

    private LevelLoader() {

    }

    public static LevelLoader getInstance() {
        return instance;
    }

    String load(String levelName) {
        return String.format("Loading level %s ...",levelName);
    }
}