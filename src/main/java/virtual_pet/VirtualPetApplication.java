package virtual_pet;

import java.time.Clock;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class VirtualPetApplication {
    Snake jake = new Snake("Jake", "green", 3, 6, false);

    public static void main(String[] args) {
        VirtualPetApplication myVirtualPetApplication = new VirtualPetApplication();
        myVirtualPetApplication.snakeTestMethod();
    }
    public void snakeTestMethod() {
        System.out.println(jake.status());
        Scanner userInput = new Scanner(System.in);
        Clock baseClock = Clock.systemUTC();
        while (true) {
            System.out.println("To play with your pet, type '1'. To feed your pet, type '2'. To check the status of your pet, type '3'. To quit, press '4'.");
            int action = userInput.nextInt();
            if (action == 1) {
                jake.playing();
            } else if (action == 2) {
                jake.feeding();
            } else if (action == 3) {
                System.out.println(jake.status());
            } else if (action == 4) {
                break;
            } else {
                System.out.println("Please choose a valid input!");
               // snakeTestMethod();
            }
        }
    }
}
