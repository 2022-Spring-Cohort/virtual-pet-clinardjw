package virtual_pet;

public abstract class RoboticPet extends Pet{
    protected String name;
    protected int fuel;
    protected int wear;


    public RoboticPet(String name, int fuel, int wear) {
        super();
        this.fuel = fuel;
        this.wear = wear;
        this.name = name;
    }


    public int getFuel() {
        return fuel;
    }

    public int getWear() {
        return wear;
    }


    abstract void refuel();

    abstract void maintenance();

}
