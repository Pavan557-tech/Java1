package function;

public class FDemo {
    public static void main(String[] args) {
        FInterface fInterface = ()-> {
            System.out.println("hello");
            return 1;
        };
        System.out.println(fInterface.print1());
    }
}
