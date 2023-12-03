/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejemplosexamen;

import java.util.Scanner;
import java.util.Random;

/**
 * Realiza un programa java que simule una carrera de 2 caballos, considerando
 * que ambos tienen la misma probabilidad de ganar.
 * 
 * Cada vez que avanza un caballo lo hace en una unidad. Ambos parten desde el
 * valor 0 y la meta se encuentra en el valor resultante
 * de sumar los valores ASCII del nombre que el usuario introduzca desde el
 * teclado.
 * 
 * El caballo que primero llegue a la meta ganará.
 * 
 * Visualmente el avance de cada caballo se hará imprimiendo por consola, el
 * valor 1 para el primer caballo y el 2 para el segundo.
 * 
 * Puedes utilizar la instrucción Thread.sleep(500) para introducir un retardo
 * de medio segundo en cada avance.
 * 
 * @author diaesqal
 */
public class ExamenD {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Introduce el nombre del usuario: ");
        String nombre = sc.nextLine().toLowerCase();

        String caballo1 = "";
        String caballo2 = "";

        int suma = 0;

        for (int i = 0; i < nombre.length(); i++) {
            int ascii = nombre.charAt(i);
            suma = suma + ascii;
        }

        System.out.println("La meta esta en: " + suma);
        int cont1 = 0;
        int cont2 = 0;

        while (cont1 < suma && cont2 < suma) {
            int avance = r.nextInt(1, 3);
            if (avance == 1) {
                caballo1 = caballo1 + 1;
                System.out.println(caballo1);
                System.out.println(caballo2);
                Thread.sleep(200);
                System.out.println();
                cont1++;
            } else if (avance == 2) {
                caballo2 = caballo2 + 2;
                System.out.println(caballo1);
                System.out.println(caballo2);
                Thread.sleep(200);
                System.out.println();
                cont2++;
            }
        }

        if (cont1 == suma) {
            System.out.println("GANA EL CABALLO 1");
        } else if (cont2 == suma) {
            System.out.println("GANA EL CABALLO 2");
        }
    }
}
