package week5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Files file = new Files("bestand.txt");
        //file.create();
        //file.read();
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) { // Doorloop het bestand
            String tekstRegel = scanner.nextLine(); // Haal er één regel uit.
            System.out.println(tekstRegel); // Print deze regel.
        }
    }
}
