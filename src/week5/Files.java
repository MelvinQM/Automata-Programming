package week5;
import week2.huisdier.Pet;

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
            pw.printf("%s", pets.getClass());
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


}
