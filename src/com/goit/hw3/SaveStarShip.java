package com.goit.hw3;

import java.math.RoundingMode;
import java.util.Scanner;

public class SaveStarShip {
    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        System.out.println(ship.isHangarOk(100, 75, 100000));
        System.out.println(ship.isHangarOk(100, 25, 10000));
    }

    public int calculateDistance(int distance) {
        return distance < 0 ? -distance : distance;
    }

    public String[] getPlanets(String galaxy) {

        final String[] Miaru = {"Maux", "Reux", "Piax"};
        final String[] Milkyway = {"Earth", "Mars", "Jupiter"};
        final String[] DangerBanger ={"Fobius", "Demius"};

        if ("Miaru".equals(galaxy)) {
            return Miaru;
        } else if ("Milkyway".equals(galaxy)) {
            return Milkyway;
        } else if ("DangerBanger".equals(galaxy)) {
            return DangerBanger;
        }
        return new String[]{};
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        switch (fuel) {
            case "STAR100" : return 70 * count;
            case "STAR500" : return 120 * count;
            case "STAR1000" : return 200 * count;
            default: return 50 * count;
        }
    }
    public int roundSpeed(int speed) {
        if (speed < 10) return 10; // Пришлось добавить проверку
        if (speed > 89) return 90; // Пришлось добавить проверку
        return Math.round((float)speed/10) * 10;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) return 1000;
        return 1000 + ((distance - 20) * 5);
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.close();

        int maxPower = Math.max(Math.max(a,b),c);

        float coeff;

        if (maxPower < 10)
            coeff = 0.7f;
        else if (maxPower <= 100)
            coeff = 1.2f;
        else
            coeff = 2.1f;

        float resultPower = coeff * maxPower;
        System.out.println(resultPower);
    }

    public String getMyPrizes(int ticket) {
        String result = "";

        if (ticket % 10 == 0)
            result += "crystall ";

        if (String.valueOf(ticket).endsWith("7"))
            result += "chip ";

        if (ticket > 200)
            result += "coin ";

        return result.trim();
    }

    // 23
    public boolean isHangarOk(int side1, int side2, int price) {
        int square = side1 * side2;
        final boolean isSquareOk = square >= 1500;
        final boolean  isSideOk = Math.max(side1,side2) / 2 <= Math.min(side1,side2);
        final boolean isPriceOk = price / square <= 1000;

        //System.out.printf("%b %b %b %n", isSquareOk, isSideOk, isPriceOk);

        return isSquareOk && isSideOk && isPriceOk;
    }


}