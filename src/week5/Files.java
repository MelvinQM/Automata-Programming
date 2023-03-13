package week5;
import week2.huisdier.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
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
        while(scanner.hasNext()) {                  // Scan through the file
            String tekstRegel = scanner.nextLine(); // Get one line from the file
            System.out.println(tekstRegel);    // Print this line
        }
        System.out.println("--------End of file--------");
    }
    public void addPet(String animalName, String name, ArrayList<Pet> pets) throws InterruptedException {
        switch (animalName){
            case "Dog":
                pets.add(new Dog(name));
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
                System.out.println("Error Wrong input");

        }
        System.out.printf("%s the %s created! Make sure to save your changes!\n\n", name, animalName);
        Thread.sleep(1000);
    }
    public void clearFile(ArrayList<Pet> pets) throws InterruptedException {
        pets.clear();
        System.out.println("File cleared! Make sure to save your changes!\n");
        Thread.sleep(1000);
    }
}
