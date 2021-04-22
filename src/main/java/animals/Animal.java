package animals;

public abstract class Animal {

    final int noOfLegs = 4;
    private int a=0;
    String animalName;

    public abstract void animalSound();

    public final boolean eatsRice(){
        System.out.println("Animal eats rice");
        return true;
    }
}
