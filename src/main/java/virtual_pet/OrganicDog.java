package virtual_pet;


public class OrganicDog extends OrganicPet{

    public OrganicDog(String name, int hunger, int exhaustion, int hygiene) {
        super(name, hunger, exhaustion, hygiene);
    }


    @Override
    void feed() {
        if (hunger >= 50) {
            System.out.println("You feed " + name + ". It seems happy!");
            hunger -= 50;
        } else {
            System.out.println( name  + " is not hungry right now.");
        }
    }

    @Override
    void sleep() {
            if (exhaustion >= 75) {
                System.out.println( name + " rests. It seems to be sleeping well.");
                exhaustion -= 75;
            } else {
                System.out.println( name + " is not tired enough to go to sleep. Try interacting with it!");
            }
    }

    @Override
    void clean() {
        if (hygiene <= 25) {
            System.out.println("You clean" + name + "'s living space. It seems much more comfortable.");
            hygiene += 75;
        } else {
            System.out.println( name + "'s living space does not need cleaning right now.");
        }
    }

    @Override
    void tick() {
        hunger += 25;
        exhaustion +=25;
        hygiene -=25;
    }

    public void walk() {
        if ( exhaustion <= 75 ) {
            System.out.println("You walk your dog. It becomes more tired!");
            exhaustion += 25;
            hygiene += 25;
        }
        else {
            System.out.println("Your dog seems tired and does not want to walk. Try letting it rest first!");
        }
    }

    @Override
    public String status() {

        return name + " status: hunger " + hunger + "/100, exhaustion " + exhaustion + "/100, hygiene " + hygiene + "/100.";
    }
}
