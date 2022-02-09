package virtual_pet;

public abstract class Pet {
    protected static String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

public abstract String status();
}
