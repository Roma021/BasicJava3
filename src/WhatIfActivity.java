import java.util.Scanner;
public class WhatIfActivity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("First number: ");
        num1 = keyboard.nextInt();

        System.out.print("Second number: ");
        num2 = keyboard.nextInt();

        int sum = num1 + num2;
        int prod = num1 * num2;
        double avg = (double)(num1 + num2) / 2;

        if (sum < 1000 && sum > 200) {
            System.out.println("The sum = " + sum + " * ");
            System.out.println(" The product = " + prod);
            System.out.println("The average = " + avg);
        } else if (sum < 1000) {
            System.out.println("The sum = " + sum + " ~ ");
            System.out.println("The product = " + prod );
            System.out.println("The averge = " + avg);
        }
    }
}


