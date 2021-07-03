package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your average:");
        double number = input.nextDouble();
        if (number < 100.0D && number >= 90.0D) {
            System.out.println("AA");
        } else if (number < 90.0D && number >= 80.0D) {
            System.out.println("BA");
        } else if (number < 80.0D && number >= 70.0D) {
            System.out.println("BB+");
        } else if (number < 70.0D && number >= 60.0D) {
            System.out.println("BB");
        } else if (number < 60.0D && number >= 50.0D) {
            System.out.println("BC");
        } else if (number < 50.0D && number >= 45.0D) {
            System.out.println("CC");
        } else if (number < 45.0D) {
            System.out.println("FF");
        }

    }
    }

