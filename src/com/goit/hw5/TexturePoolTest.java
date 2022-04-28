package com.goit.hw5;

class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}

class TexturePool {

    private static TexturePool instance;

    private TexturePool() {

    }

    public static TexturePool getInstance() {

        if (instance == null) {
            instance = new TexturePool();
        }

        return instance;
    }

    public String getTexture(String textureName) {
        return String.format("Get texture %s",textureName);
    }
}