package week5;
import week4.machine1.Machine;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Files {
    private String fileName;
    public Files(String fileName){
        this.fileName = fileName;
        try {
            File file = new java.io.File("src\\week5\\" + fileName);
            if (file.createNewFile()) {
                System.out.println("Bestand aangemaakt, genaamd: " + file.getName());
            } else {
                System.out.println("Bestand bestaat al.");
            }
        } catch (IOException e) {
            System.out.println("Er ging wat mis...");
            e.printStackTrace();
        }
    }
//    public void create(){
//        try {
//            File file = new java.io.File("src\\week5\\" + fileName);
//            if (file.createNewFile()) {
//                System.out.println("Bestand aangemaakt, genaamd: " + file.getName());
//            } else {
//                System.out.println("Bestand bestaat al.");
//            }
//        } catch (IOException e) {
//            System.out.println("Er ging wat mis...");
//            e.printStackTrace();
//        }
//    }
    public void add(){}
    public void delete(){}
    public void edit(){}
    public void read(){
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) { // Doorloop het bestand
            String tekstRegel = scanner.nextLine(); // Haal er één regel uit.
            System.out.println(tekstRegel); // Print deze regel.
        }

    }


}
