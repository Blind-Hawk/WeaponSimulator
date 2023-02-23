package programm;
import weapons.firearm;
import weaponparts.magazine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to the text based Weapon Simulator made by Roman Zimmer");
        System.out.println("Just follow the following requests to make and use your weapon \n");
        System.out.println("Now what is the name of your weapon?");
        System.out.print("Type here:");
        String weaponName = userInput.nextLine();

        System.out.println("What is the weapon class of your weapon? (for example pistol, rifle, shotgun)");
        System.out.print("Type here:");
        String weaponClass = userInput.nextLine();

        System.out.println("What is the caliber of your weapon? (for example 9mm, 5.56mm, 12gauge)");
        System.out.print("Type here:");
        double caliber = userInput.nextDouble();

        System.out.println("What is the firemode of your weapon? (for example 1 = semi, 2 = burst, 3 = auto)");
        System.out.print("Type here:");
        int firemode = userInput.nextInt();

        System.out.println("Is your weapon foldable? (for example true = foldable, false = not foldable)");
        System.out.print("Type here:");
        boolean foldable = userInput.nextBoolean();
        userInput.close();

        firearm weapon = new firearm(weaponName, weaponClass, caliber, firemode, foldable);
        System.out.println("Your weapon is now created!");
    }
}
