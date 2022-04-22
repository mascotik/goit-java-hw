package com.goit.hw3;
import java.util.Scanner;

public class PassportFormCreator {

    public static void main(String[] args) {
        PassportFormCreator passport = new PassportFormCreator();
        passport.createForms();
    }

    public void createForms() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surName = scanner.nextLine();
        int age = scanner.nextInt();
        int marsAge = age*10;

        System.out.println(name+" "+surName+" "+marsAge);
        System.out.println(name.toUpperCase());
        System.out.println(surName.toUpperCase());
        System.out.println(marsAge);

        scanner.close();
    }
}