package com.example;

public class Main {
    public static void main(String[] args) {
        Character jillValentine = new JillValentine(new Shotgun());
        System.out.println(jillValentine.sayName());
        System.out.println(jillValentine.attack());
        jillValentine = new JillValentine(new Pistol());
        System.out.println(jillValentine.attack());
        System.out.println();
        Character adaWong = new AdaWong(new Shotgun());
        System.out.println(adaWong.sayName());
        System.out.println(adaWong.attack());
        adaWong = new AdaWong(new Pistol());
        System.out.println(adaWong.attack());
    }
}