/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.hilos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fernanda
 */
public class Corredor {

    public void Matriz() {
        Random randon = new Random();
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese dimension de matriz");
        int ma1 = sn.nextInt();

        int[][] m1 = new int[ma1][ma1];
        int[][] m2 = new int[ma1][ma1];
        int valor = m1.length;
        int[][] res = new int[ma1][ma1];
        int[][] res1 = new int[ma1][ma1];

        long inicio1 = System.currentTimeMillis();

        for (int i = 0; i < ma1; i++) {
            for (int j = 0; j < ma1; j++) {
                m1[i][j] = randon.nextInt(10);
            }
        }
        for (int i = 0; i < ma1; i++) {
            for (int j = 0; j < ma1; j++) {
                m2[i][j] = randon.nextInt(10);
            }
        }
        for (int i = 0; i < ma1; i++) {
            for (int j = 0; j < ma1; j++) {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }

        long fin1 = System.currentTimeMillis();
        System.out.println("Tiempo de Suma sin hilos: " + (fin1 - inicio1));

        /*
         System.out.println("Matriz 1");
         mostrarMatriz(m1);
         System.out.println("Matriz 2");
         mostrarMatriz(m2);
         System.out.println("Respuesta");
         mostrarMatriz(res);
         */
        System.out.println("Respuesta Suma: ");
        mostrarMatriz(res);

        int posicion1 = 0;
        int posicion = m1.length / 4;
        SumaDeHilos[] hilos = new SumaDeHilos[4];
        long inicio2 = System.currentTimeMillis();
        for (int i = 0; i < 4 - 1; i++) {
            hilos[i] = new SumaDeHilos(m1, m2, res1, posicion1, posicion);
            hilos[i].start();
            posicion1 = posicion;
            posicion = posicion + posicion;
        }/*
         hilos[0] = new SumaDeHilos(m1, m2, res1, 0, posicion);
         hilos[1] = new SumaDeHilos(m1, m2, res1, posicion, (2*posicion));
         hilos[2] = new SumaDeHilos(m1, m2, res1, (2*posicion), (3*posicion));
         hilos[3] = new SumaDeHilos(m1, m2, res1, (3*posicion), valor);
         hilos[0].start();
         hilos[1].start();
         hilos[2].start();
         hilos[3].start();
         */

        long fin2 = System.currentTimeMillis();
        System.out.println("Tiempo de suma con hilos Secuencias: " + (fin2 - inicio2));

    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.print("]");
            System.out.println("");
        }
    }

}
