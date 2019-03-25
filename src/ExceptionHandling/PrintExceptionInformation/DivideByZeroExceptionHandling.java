package ExceptionHandling.PrintExceptionInformation;

import java.util.Scanner;

public class DivideByZeroExceptionHandling {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int a = scanner.nextInt();
        System.out.println("Please enter another integer: ");
        int b =scanner.nextInt();

        int result = a/b;

        System.out.println(String.format("Result: %d/%d = " + "%d", a, b, result));
    }



}
