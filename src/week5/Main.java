package week5;

import week2.huisdier.Cat;
import week2.huisdier.Dog;
import week2.huisdier.Pet;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Files file = new Files("bestand.txt");
        Scanner s = new Scanner(System.in);
        //Making an Arraylist of pet objects
        ArrayList<Pet> pets = new ArrayList<>();
            pets.add(new Dog("Karel"));
            pets.add(new Cat("Cerel"));

        String name;
        String animalName;
        while(true){
            System.out.println("Choose between these options:");
            System.out.println("Choose 1 to add a Pet to the file");
            System.out.println("Choose 2 to edit a Pet from the file");
            System.out.println("Choose 3 to delete a pet from the file");
            System.out.println("Choose R to read the file");
            System.out.println("Choose S to save the file");
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
                //Edit
                case '2':
                    break;
                //Delete
                case '3':
                    System.out.println("Choose an animal from this list to delete(Cat, Dog, Poodle, Chihuahua, Tiger)");
                    System.out.print("My animal is a: ");
                    animalName = s.next();
                    System.out.print("What is his or her name:");
                    name = s.next();
                    file.deletePet(animalName, name, pets);
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

