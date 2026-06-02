package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kubiin irmeg: ");
        long side = scanner.nextLong();

        kub kub = new kub(side);
        System.out.println("ezelhuun: " + kub.getVolume() + " " + "gadarguin talbai: " + kub.getSurfaceArea());
        System.out.println("oorchlolt");
        scanner.close();
    }
}