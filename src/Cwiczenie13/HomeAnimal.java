package Cwiczenie13;

public class HomeAnimal <T extends Animal & Run & Speak>{
    T animal;
    public HomeAnimal(T animal){
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    void showType(){
        System.out.println("Typ T jest : " + animal.getClass().getName());
    }
    void eat(){
        System.out.println("The home animal " + animal.getName() +" is eating");
    }

}
