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
        System.out.println("Ingrese las columnas");
        int columnas = sn.nextInt();
 //       System.out.println("Ingrese numero de Filas");
 //       int filas = sn.nextInt();
        int matriz1[][] = new int[1000][columnas];
        //int matriz2[][] = new int[filas][columnas];
        //int resultado[][] = new int[filas][columnas];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = randon.nextInt(5000);
          //      matriz2[i][j] = randon.nextInt(5000);
             //   resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("Matriz 1");
        mostrarMatriz(matriz1);
        System.out.println("Matriz 2");
      //  mostrarMatriz(matriz2);
        System.out.println("Resultado");
        //mostrarMatriz(resultado);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println(matriz[i][j]+"");
            }
        }
    }

   
}
