package com.pluralsight;

import java.util.Scanner;

public class SandwichApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu\n" +
                "a. 1: Regular: base price price $5.45\n" +
                "b. 2: Large: base price $8.95\n" +
                "Enter 1 or 2: ");

        int customerChoice = input.nextInt();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        double price;


        if (age <= 17){
            if(customerChoice == 1){
                price = 5.45 * .9;
            } else{
                price = 8.95 * .9;
            }
        }
        else if (age >= 65){
            if(customerChoice == 1){
                price = 5.45 * .8;
            } else{
                price = 8.95 * .8;
            }
        } else {
            if(customerChoice == 1){
                price = 5.45;
            } else{
                price = 8.95;
            }
        }


        System.out.printf("Your cost will be $%.2f.", price);
    }
}






