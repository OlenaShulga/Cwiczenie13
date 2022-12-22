package Cwiczenie13;

public class Dog extends Animal implements Run, Speak{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run(String name) {
        System.out.println("The dog " +  name + " is running");
    }
    @Override
    public void speak(String name){
        System.out.println("The dog " +  name + " is barking");
    }
}
