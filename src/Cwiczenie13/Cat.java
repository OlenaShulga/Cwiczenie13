package Cwiczenie13;

public class Cat extends Animal implements Run, Speak{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run(String name) {
        System.out.println("The cat " + name+ " is running");
    }
    @Override
    public void speak(String name){
        System.out.println("The cat " + name+ " is meowing");
    }
}
