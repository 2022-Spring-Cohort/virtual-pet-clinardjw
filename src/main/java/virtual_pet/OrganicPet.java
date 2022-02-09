package virtual_pet;

public abstract class OrganicPet extends Pet{
    protected int hunger;
    protected int exhaustion;
    protected int hygiene;

    public OrganicPet(int hunger, int exhaustion, int hygiene) {
        super(name);
        this.hunger = hunger;
        this.exhaustion = exhaustion;
        this.hygiene = hygiene;
    }


    public int getHunger() {
        return hunger;
    }

    public int getExhaustion() {
        return exhaustion;
    }

    public int getHygiene() {
        return hygiene;
    }

    abstract void feed();

    abstract void sleep();


    abstract void clean();


    abstract void tick();

}
