package virtual_pet;

public class RoboticDog extends RoboticPet{
    public RoboticDog(int fuel, int wear) {
        super(fuel, wear);
    }

    @Override
    void refuel() {
        if ( fuel <= 50 ) {
            System.out.println("You put oil in your robotic dog. It is refueled and ready to go!");
            fuel +=75 ;
        } else {
            System.out.println("Your robotic dog does not need any oil currently, it has enough fuel to run for some time.");
        }
    }

    @Override
    void maintenance() {
        if (wear >= 75) {
            System.out.println("You initiate maintenance on your robotic pet. It seems good as new!");
            wear -= 75;
        } else {
            System.out.println("Your robotic cat does not need maintenance currently.");
        }
    }

    public void walk() {
        if ( fuel >= 25 ) {
            System.out.println("You walk your robotic dog. It uses fuel, and its machinery starts to wear!");
            wear += 25;
            fuel -= 25;
        }
        else {
            System.out.println("Your dog seems tired and does not want to walk. Try letting it rest first!");
        }
    }

    @Override
    public String status() {

        return name + " status: " + fuel + "/100, " + wear + "/100.";
    }
}
