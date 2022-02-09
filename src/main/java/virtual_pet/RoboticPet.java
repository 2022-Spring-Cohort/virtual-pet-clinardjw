package virtual_pet;

public abstract class RoboticPet extends Pet{
    protected int fuel;
    protected int wear;


    public RoboticPet(int fuel, int wear) {
        super(name);
        this.fuel = fuel;
        this.wear = wear;
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
