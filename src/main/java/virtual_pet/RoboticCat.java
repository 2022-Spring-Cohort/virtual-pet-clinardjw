package virtual_pet;

public class RoboticCat extends RoboticPet{
    public RoboticCat(String name, int fuel, int wear) {
        super(name, fuel, wear);
    }

    @Override
    void refuel() {
        if ( fuel <= 50 ) {
            System.out.println("You put oil in your robotic cat. It is refueled and ready to go!");
            fuel +=75 ;
        } else {
            System.out.println("Your robotic cat does not need any oil currently, it has enough fuel to run for some time.");
        }
    }

    @Override
    void maintenance() {
        if ( wear >=75 ) {
            System.out.println("You initiate maintenance on your robotic cat. It seems good as new!");
            wear -=75;
        } else {
            System.out.println("Your robotic cat does not need maintenance currently.");
        }
    }

    @Override
    public String status() {

        return name + " status: fuel " + fuel + "/100, wear " + wear + "/100.";
    }
}
