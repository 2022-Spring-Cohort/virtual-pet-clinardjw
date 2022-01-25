package virtual_pet;

public class Snake {
    private String name;
    private String color;
    private int age;
    private int length;
    private boolean hungry;

    public Snake(String name, String color, int age, int length, boolean hungry) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.length = length;
        this.hungry = hungry;
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

    public boolean isHungry() {
        return hungry;
    }
    public void feed(){
        hungry = false;
    }

    public String status(){
        String hungryMessage = "";
        if(hungry){
            hungryMessage = name + " is hungry!";
        }
        else{
            hungryMessage = name + " is not hungry";
        }
        return name + " is a " + color + " Snake. It is " + age + " years old and " + length + " inches long. "+ hungryMessage;
    }

    public void playing(){
        if ( hungry == true ){
            System.out.println("Your pet is already hungry, you should feed it!");
        }
        else {
            System.out.println("You play with your pet. It seems to be getting hungry!");
                hungry = true;
        }
    }
    public void feeding(){
        if ( hungry = true ){
            System.out.println("Your feed your pet. He seems to have grown!");
            hungry = false;
            length += 1;
        }
        else {
            System.out.println("Your snake is not hungry right now.");
        }
    }
}

