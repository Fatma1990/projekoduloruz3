
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        double appleF = 1.24D;
        double orangeF = 4.7D;
        double tomatoF = 3.22D;
        double cherryF = 1.9D;
        Scanner input = new Scanner(System.in);
        System.out.print("how many appels?");
        double appleKg = input.nextDouble();
        double appleT = appleF * appleKg;
        System.out.print("how many orange?");
        double orangeKg = input.nextDouble();
        double orangeT = orangeF * orangeKg;
        System.out.print("how many tomato?");
        double tomatoKg = input.nextDouble();
        double tomatoT = tomatoF * tomatoKg;
        System.out.print("how many cherries?");
        double cherryKg = input.nextDouble();
        double cherryT = cherryKg * cherryF;
        double sum = appleT + orangeT + tomatoT + cherryT;
        System.out.print("sum:");
        System.out.println(sum);
    }
}




