package com.goit.hw4;

public class SpaceShip {

    private  String name = "Voyager";
    private String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String result = "";

        if (name.length() > 100 || name.trim() == "")
            return;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) > ' ') {
                result += name.charAt(i);
            }
        }

        this.name = result;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serial) {
        final String prefix = "SN";

        if (serial.length() != 8) {
            return;
        }

        if (!prefix.equals(serial.substring(0,2))) {
            return;
        }

        this.serialNumber = serial;
    }

    public void printInfo() {
        System.out.printf("Name is %s, serial number is %s",this.name,this.serialNumber);
    }

    // ==============================================================================

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value
    }
}
