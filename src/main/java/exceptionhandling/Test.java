package exceptionhandling;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Start");
        ///



        Scanner scanner = new Scanner(System.in);

        while (true){
            int val[]= {1,2};
            try{



                try{
                    System.out.println("divide output "+divide(0));
                } catch (ArithmeticException e){
                    System.out.println("ArithmeticException for divide.");
                }

                System.out.println("Enter i");
                int i = scanner.nextInt();



                System.out.println("Val = "+val[i]);



                int k = 1/i;
                System.out.println("K = "+k);

            } catch (ArithmeticException e){

                System.out.println("i is 0 and it is invalid");

            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("i greater than "+val.length);
            } finally {
                System.out.println("Program End");
            }
        }
    }



    public static int divide(int i) throws ArithmeticException{
        return 100/i;
    }


}
