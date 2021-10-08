package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cuantas veces quieres tirar?");

        int veces = 0;

        try {
            veces = scan.nextInt();

        } catch (Exception a) {
            System.out.println("Pon un numero");
        }
        for (int i = 0; i < veces; i++) {
            int dado1 = (int) (Math.random() * 6 + 1);
            int dado2 = (int) (Math.random() * 6 + 1);
            System.out.println(dado1 + dado2);
            //System.out.println(dado2);
        }
//dejo comentado el ultimo sout porque no se si qquieres que muestre la sua de los dos dados en cada tirada o que muestre cada lanzamiento de cada dado(en ese caso en el primer sout quitaria el + dado2)
    }
}