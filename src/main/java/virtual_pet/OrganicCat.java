package virtual_pet;

public class OrganicCat extends OrganicPet {

    public OrganicCat(int hunger, int exhaustion, int hygiene) {
        super(hunger, exhaustion, hygiene);
    }

    @Override
    void feed() {
        if (hunger >= 50) {
            System.out.println("You feed " + name + ". It seems happy!");
            hunger -= 50;
        } else {
            System.out.println(name + " is not hungry right now.");
        }
    }

    @Override
    void sleep() {
        if (exhaustion >= 75) {
            System.out.println(name + " rests. It seems to be sleeping well.");
            exhaustion -= 75;
        } else {
            System.out.println(name + " is not tired enough to go to sleep. Try interacting with it!");
        }
    }

    @Override
    void clean() {
        if (hygiene <= 25) {
            System.out.println("You clean" + name + "'s living space. It seems much more comfortable.");
            hygiene += 75;
        } else {
            System.out.println(name + "'s living space does not need cleaning right now.");
        }
    }

    @Override
    void tick() {
        hunger += 25;
        exhaustion += 25;
        hygiene -= 25;
    }

    @Override
    public String status() {
        return name + " status: " + hunger + "/100, " + exhaustion + "/100, " + hygiene + "/100.";
    }
}
