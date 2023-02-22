package week2.auto;

import week2.auto.Auto;

/*
Melvin Moes 500905603
15-02-2023
Auto object assignment
 */
public class Main {

    // maak packages om je practicum opdrachten in 1 project te beheren. Zorg wel dat alle code blijft werken.

    public static void main(String[] args) {
        System.out.println("Made by: Melvin Moes 500905603");
        Auto auto1 = new Auto("Koen", "Toyota", 900);
        Auto auto2 = new Auto("Lucas", "Renault", 1200);
        Auto auto3 = new Auto("Melvin", "Seat", 1000);
        auto3.honkSound = "BEEEP";
        auto1.Print();
        auto2.Print();
        auto3.Print();
        auto1.Honk();
        auto2.Honk();
        auto3.Honk();
    }
}
