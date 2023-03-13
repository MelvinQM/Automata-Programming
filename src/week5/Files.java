package week5;
import week2.huisdier.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {
    private File path;
    //Object constructor create the file if not already created
    public Files(String fileName){
        try {
            path = new java.io.File("src\\week5\\" + fileName);
            if (path.createNewFile()) {
                System.out.println("Bestand aangemaakt, genaamd: " + path.getName());
            } else {
                System.out.println("Bestand bestaat al.");
            }
        } catch (IOException e) {
            System.out.println("Er ging wat mis...");
            e.printStackTrace();
        }
    }
    //Function to insert data into file
    public void insertData(ArrayList<Pet> pets) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(path);

        for(Pet pet : pets){
            pw.printf("%s\n", pet.getName());
        }
        pw.close();
    }
    public void readData() throws FileNotFoundException {
        Scanner scanner = new Scanner(path);
        while(scanner.hasNext()) { // Doorloop het bestand
            String tekstRegel = scanner.nextLine(); // Haal er één regel uit.
            System.out.println(tekstRegel); // Print deze regel.
        }

    }
    public void addPet(String animalName, String name, ArrayList<Pet> pets) throws InterruptedException {
        switch (animalName){
            case "Dog":
                pets.add(new Dog(name));
                pets.get(pets.size() - 1);
                break;
            case "Cat":
                pets.add(new Cat(name));
                break;
            case "Chihuahua":
                pets.add(new Chihuahua(name));
                break;
            case "Poodle":
                pets.add(new Poodle(name));
                break;
            case "Tiger":
                pets.add(new Tiger(name));
                break;
            default:
                System.out.println("Error");

        }
        System.out.printf("%s the %s created! Make sure to save your changes!\n\n", name, animalName);
        Thread.sleep(1000);
    }
    public void deletePet(String animalName, String name, ArrayList<Pet> pets) throws InterruptedException {
        switch (animalName){
            case "Dog":
                pets.remove(name);
                break;
            case "Cat":
                pets.remove(new Cat(name));
                break;
            case "Chihuahua":
                pets.remove(new Chihuahua(name));
                break;
            case "Poodle":
                pets.remove(new Poodle(name));
                break;
            case "Tiger":
                pets.remove(new Tiger(name));
                break;
            default:
                System.out.println("Error");

        }
        System.out.printf("%s the %s deleted! Make sure to save your changes!\n\n", name, animalName);
        Thread.sleep(1000);
    }
}
