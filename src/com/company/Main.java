package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        InvertPH invert = new InvertPH(scanner.nextLine());
        System.out.println(invert.invertString());



    }
}
