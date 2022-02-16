package virtual_pet;

import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;

public class VirtualPetApplication {
    OrganicDog Finn = new OrganicDog( "Finn", 0, 0,0);
    RoboticDog Nina = new RoboticDog("Nina",100, 0);
    OrganicCat Piper = new OrganicCat("Piper",0,0,100);
    RoboticCat Cali = new RoboticCat("Cali",100, 0);

//change to array-list
    Pet[] Pets = {Finn, Nina, Piper, Cali};
    Pet activePet = Pets[00];

    public static void main(String[] args) {
        VirtualPetApplication myVirtualPetApplication = new VirtualPetApplication();
        myVirtualPetApplication.petTestMethod();
    }

    //user selects pet
    public void petSelectMethod() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You do not currently have an active pet. To adopt Finn, press '1'. To adopt Nina, press '2'. To adopt Piper, press '3'. To adopt Cali, press '4'");
        int selectedPet = userInput.nextInt();
        if (selectedPet == 1) {
            activePet = Finn;
            System.out.println("You have adopted Finn.");
        } else if (selectedPet == 2) {
            activePet = Nina;
            System.out.println("You have adopted Nina.");
        } else if (selectedPet == 3) {
            activePet = Piper;
            System.out.println("You have adopted Piper.");
        } else if (selectedPet == 4) {
            activePet = Cali;
            System.out.println("You have adopted Cali.");
        }
    }

    //user interacts with pet
    public void petTestMethod() {
        System.out.println(activePet.status());
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("To feed/fuel your pet, press '1'. To rest/do maintenance on your pet, press '2'. To clean your pet's living area, press '3'. To walk your pet, press '4'. \nTo check the status of all pets, press '5'. To swap pets, press '6'. To quit, press '7'.");
            int action = userInput.nextInt();
            if (action == 1) {
                if (activePet instanceof OrganicPet) {
                    ((OrganicPet) activePet).feed();
                }
                if (activePet instanceof RoboticPet)
                    ((RoboticPet) activePet).refuel();
            } else if (action == 2) {
                if (activePet instanceof OrganicPet) {
                    ((OrganicPet) activePet).sleep();
                }
                if (activePet instanceof RoboticPet)
                    ((RoboticPet) activePet).maintenance();
            } else if (action == 3) {
                if (activePet instanceof OrganicPet) {
                    ((OrganicPet) activePet).clean();
                }
                if (activePet instanceof RoboticPet)
                    System.out.println("Robotic pets do not require you to clean up after them!");
            } else if (action == 4) {
                if (activePet instanceof OrganicDog) {
                    ((OrganicDog) activePet).walk();
                }else if (activePet instanceof  RoboticDog) {
                    ((RoboticDog) activePet).walk();
                }else System.out.println("Cats do not require you to walk them!");
            } else if (action == 5) {
                //for-each loop
                //for each pet in array, print status
               System.out.println(Finn.status());
               System.out.println(Nina.status());
               System.out.println(Piper.status());
               System.out.println(Cali.status());
            } else if (action == 6) {
                petSelectMethod();
            } else if (action == 7) {
                break;
            } else {
                System.out.println("Please choose a valid input!");
            }
        }
    }
}


