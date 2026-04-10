package com.pluralsight;

import java.util.Scanner;

public class SandwichApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu:\n" +
                "a. 1: Regular: base price price $5.45 ($1.00 extra for loaded)\n" +
                "b. 2: Large: base price $8.95 ($1.75 extra for loaded)\n" +
                "Enter 1 or 2: ");

        int customerChoice = input.nextInt();
        System.out.println("Do you want it loaded (double everything)" +
                "? Enter (yes/no): ");
        String loadedChoice = input.next();


        System.out.println("Enter your age: ");
        int age = input.nextInt();

        double price;


        if (age <= 17){
            if(customerChoice == 1){
                if (loadedChoice.equals("yes")){
                    price = 5.45 + 1;
                } else {
                    price = 5.45;
                }

                price = price * .9;

            } else{
                if (loadedChoice.equals("yes")){
                    price = 8.95 + 1.75;
                } else {
                    price = 8.95;
                }
                price = price * .9;
            }
        }
        else if (age >= 65){
            if(customerChoice == 1){
                if (loadedChoice.equals("yes")){
                    price = 5.45 + 1;
                } else {
                    price = 5.45;
                }
                price = price * .8;
            } else{
                if (loadedChoice.equals("yes")){
                    price = 8.95 + 1.75;
                } else {
                    price = 8.95;
                }
                price = price * .8;
            }
        } else {
            if(customerChoice == 1){
                if (loadedChoice.equals("yes")){
                    price = 5.45 + 1;
                } else {
                    price = 5.45;
                }
            } else{
                if (loadedChoice.equals("yes")){
                    price = 8.95 + 1.75;
                } else {
                    price = 8.95;
                }
            }
        }


        System.out.printf("Your cost will be $%.2f.", price);
    }
}






