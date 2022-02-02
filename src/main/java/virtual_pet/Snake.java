package virtual_pet;

public class Snake {
    private String name;
    private String color;
    private int age;
    private int length;
    private int hunger;

    public Snake(String name, String color, int age, int length, int hunger) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.length = length;
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getLength() {
        return length;
    }

    public int isHungry() {
        return hunger;
    }

    public String status(){
        String hungryMessage = "";
        if(hunger >= 75){
            hungryMessage = name + " is hungry!";
        }
        else{
            hungryMessage = name + " is not hungry.";
        }
        return name + " is a " + color + " Snake. It is " + age + " years old and " + length + " inches long. "+ hungryMessage;
    }

    public void playing(){
        if ( hunger >= 75 ){
            System.out.println("Your pet is hungry, you should feed it!");
        }
        else {
            System.out.println("You play with your pet. It seems to be getting hungry!");
                hunger += 25;
        }
    }
    public void feeding(){
        if (hunger >= 75){
            System.out.println("Your feed " + name + ". It seems to have grown!");
            hunger -= 25;
            length += 1;
        }
        else {
            System.out.println("Your snake is not hungry right now.");
        }
    }
    public void tick() {
        length++;
    }
    public void showSnake(){
        System.out.print(">-");
        for(int i =0;i<length;i++){

            System.out.print("░");
        }
        System.out.println("");
    }
}

