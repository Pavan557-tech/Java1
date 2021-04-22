package function;

@FunctionalInterface
public interface FInterface {
    int print1();

    static void printme(){
        System.out.printf("Print me");
    }

    static void printmeNow(){
        System.out.printf("Print me");
    }
}
