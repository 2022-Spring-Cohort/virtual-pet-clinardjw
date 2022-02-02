package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    Snake jake = new Snake("Jake", "green", 3, 6, 75);
    Snake phil = new Snake("Phil","blue",4,8,75);
    Snake jaydee = new Snake("Jaydee", "red",7, 16, 75);
    Snake devin = new Snake("Devin", "orange",7, 18,75);

    //arraylist to select
    Snake[] Snakes = {jake, phil, jaydee, devin};
    Snake activeSnake = Snakes[00];

    public static void main(String[] args) {
        VirtualPetApplication myVirtualPetApplication = new VirtualPetApplication();
        myVirtualPetApplication.snakeTestMethod();
    }
    //user selects snake
    public void snakeSelectMethod() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You do not currently have a snake. To adopt Jake, press '1'. To adopt Phil, press '2'. To adopt Jaydee, press '3'. To adopt Devin, press '4'.");
        int selectedSnake = userInput.nextInt();
        if (selectedSnake == 1) {
            activeSnake = jake;
            System.out.println("You have adopted Jake.");
        }else if (selectedSnake == 2) {
            activeSnake = phil;
            System.out.println("You have adopted Phil.");
        }else if (selectedSnake == 3) {
            activeSnake = jaydee;
            System.out.println("You have adopted Jaydee.");
        }else if (selectedSnake == 4) {
            activeSnake = devin;
            System.out.println("You have adopted Devin.");
        }
    }

    //user interacts with snake
    public void snakeTestMethod() {
        System.out.println(activeSnake.status());
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("To play with your pet, type '1'. To feed your pet, type '2'. To check the status of your pet, type '3'. To check the status of all pets, press '4'. To feed all pets, press '5'. To return your current pet to the shelter, press '6'. To quit, press '7'.");
            activeSnake.showSnake();
            int action = userInput.nextInt();
            if (action == 1) {
                activeSnake.playing();
            } else if (action == 2) {
                activeSnake.feeding();
                activeSnake.tick();
            } else if (action == 3) {
                System.out.println(activeSnake.status());
            } else if (action == 4) {
                System.out.println(jake.status());
                System.out.println(phil.status());
                System.out.println(jaydee.status());
                System.out.println(devin.status());
            }else if (action == 5) {
                    jake.feeding();
                    phil.feeding();
                    jaydee.feeding();
                    devin.feeding();
            } else if (action == 6) {
                snakeSelectMethod();
            } else if (action == 7) {
                break;
            } else {
                System.out.println("Please choose a valid input!");
               // snakeTestMethod();
            }
        }
    }
}
