package week5;

import week2.huisdier.Cat;
import week2.huisdier.Dog;
import week2.huisdier.Pet;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*
Melvin Moes 500905603
13-03-2023
Huisdier object Arraylist file management
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Files file = new Files("bestand.txt");
        Scanner s = new Scanner(System.in);
        //Making an Arraylist of pet objects
        ArrayList<Pet> pets = new ArrayList<>();

        String name;
        String animalName;
        while(true){
            System.out.println("Choose between these options:");
            System.out.println("1. to add a Pet to the file");
            System.out.println("2. to delete EVERY Pet from the file");
            System.out.println("R. to read the file");
            System.out.println("S. to save the file");
            char option = s.next().charAt(0);
            switch (option){
                //Add
                case '1':
                    System.out.println("Choose an animal from this list (Cat, Dog, Poodle, Chihuahua, Tiger)");
                    System.out.print("My animal is a: ");
                    animalName = s.next();
                    System.out.print("What is his or her name:");
                    name = s.next();
                    file.addPet(animalName, name, pets);
                    break;
                //Delete
                case '2':
                    file.clearFile(pets);
                    break;
                //Save
                case 'S'|'s':
                    file.insertData(pets);
                    break;
                //Read
                case 'R'|'r':
                    file.readData();
                    break;
                default:
                    System.out.println("Wrong input try again");
            }
        }
    }
}

