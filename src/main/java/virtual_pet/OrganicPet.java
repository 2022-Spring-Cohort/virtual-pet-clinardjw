package virtual_pet;

public abstract class OrganicPet extends Pet{
    protected String name;
    protected int hunger;
    protected int exhaustion;
    protected int hygiene;

    public OrganicPet(String name, int hunger, int exhaustion, int hygiene) {
        this.hunger = hunger;
        this.exhaustion = exhaustion;
        this.hygiene = hygiene;
        this.name = name;
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
