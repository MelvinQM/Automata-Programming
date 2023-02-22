package week2.huisdier;

import java.util.concurrent.TimeUnit;

/*
Melvin Moes 500905603
15-02-2023
Huisdier object Array Assignment
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Made by: Melvin Moes 500905603");
        Pet[] pets = new Pet[]{
            new Cat("Hendrik"),
            new Dog("Barry"),
            new Poodle("Sylvia"),
            new Tiger("Karel"),
            new Chihuahua("BAS")
        };
        System.out.println("Now all animals speak one by one first up HENDRIK the Cat:");
        TimeUnit.SECONDS.sleep(1);
        for (int i = 0; i < pets.length; i++) {
            pets[i].makeSound();
            TimeUnit.SECONDS.sleep(1);
            if (i < 4){
                System.out.printf("Great next up: %s\n", pets[i+1].getName());
            }
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("THAT WAS THE SHOW");
    }
}
