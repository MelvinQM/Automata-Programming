package week5;

import week2.huisdier.Cat;
import week2.huisdier.Dog;
import week2.huisdier.Pet;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Files file = new Files("bestand.txt");

        //Making an Arraylist of pet objects
        ArrayList<Pet> pets = new ArrayList<>();
            pets.add(new Dog("Karel"));
            pets.add(new Cat("Cerel"));

        //Write out all data into the file
        file.insertData(pets);
        //Read all data in the file
        file.readData();

    }
}
