package animals;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.animalSound();
        cat.animalSound();

        dog.eatsRice();
    }
}
