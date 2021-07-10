package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static int Age(int age) {
        int price = 100;
        if (age < 18) {
            price -= price * 10 / 100;
        } else if (18 <= age && age < 25) {
            price -= price * 5 / 100;
        }

        return price;
    }

    public static int Type(int type) {
        int ticketprice = 100;
        if (type == 1) {
            ticketprice = ticketprice * 5 / 100;
        } else if (type != 1) {
            System.out.println("it is not exit.");
        }

        return ticketprice;
    }

    public static void main(String[] args) {
        Scanner Sinema = new Scanner(System.in);
        System.out.println("enter your age :");
        int age = Sinema.nextInt();
        System.out.println("press 1 for hero  film  and press 2 for other films ");
        int type = Sinema.nextInt();
        int newprice = Age(age) - Type(type);
        System.out.println("Total Amount:" + newprice);
    }
}
