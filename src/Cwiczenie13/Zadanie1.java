package Cwiczenie13;

public class Zadanie1 {
    public static void main(String[] args) {

        HomeAnimal <Dog> homeDog = new HomeAnimal<>(new Dog("Jack"));
        HomeAnimal<Cat> homeCat = new HomeAnimal<>(new Cat("Mary"));
        homeCat.eat();
        homeDog.showType();
    }
}
