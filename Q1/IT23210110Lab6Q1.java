package Question1;

import java.util.Scanner;

public class IT23210110Lab6Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        System.out.println("The square of " + number + " is: " + (number * number));
        System.out.println("The square root of " + number + " is: " + Math.sqrt(number));

        scanner.close();
    }
}
