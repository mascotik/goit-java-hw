package com.goit.hw2;

class NameEncoderDecoder {

    final String key = "euioa";
    final String firstKey = "NOTFORYOU";
    final String lastKey = "YESNOTFORYOU";

    public String encode(String name) {
        for (int i=0; i<key.length(); i++) {
            name = name.replace(Character.toString(key.charAt(i)),Integer.toString(i+1));
        }

        return firstKey + name + lastKey;
    }

    public String decode(String name) {
        name = name.replace(lastKey,"").replace(firstKey,"");
        for (int i=0; i<key.length(); i++) {
            name = name.replace(Integer.toString(i+1),Character.toString(key.charAt(i)));
        }
        if (name.isEmpty()) {
            name = firstKey;
        }
        return name;
    }
    public static void main(String[] args) {
        NameEncoderDecoder encoderDecoder = new NameEncoderDecoder();
        // expect NOTFORYOUCr5bYESNOTFORYOU
        System.out.println(encoderDecoder.encode("Crab"));
    }
}