package animalsinterfaces;

public interface Animal {

    boolean eatsRice();
    void sampleSound();
    default void sleep(){
        System.out.println("Sleep");
    }
}
