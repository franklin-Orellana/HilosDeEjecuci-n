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
    /*
    private String nombre;
    private int velocidad;

    public Corredor(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = 1000;
    }
    /*
    @Override
    public void run() {
        try{
            System.out.println("Inicia: ");
            long inicio = System.currentTimeMillis();
            Thread.sleep(velocidad);
            long fin = System.currentTimeMillis();
            System.out.println("Tiempo de llegada: " + this.nombre + " es " + (fin - inicio));
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
    */
    public void Matriz() {
        Random randon = new Random();
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese numero de filas");
        int f1 = sn.nextInt();
        System.out.println("Ingrese numero de columnas");
        int c1 = sn.nextInt();

        int[][] m1 = new int[f1][c1];
        int[][] m2 = new int[f1][c1];

        int[][] res = new int[f1][c1];
        int[][] subMat1 = new int[25][25];
        int[][] subMat2 = new int[50][25];
        int[][] subMat3 = new int[75][25];
        int[][] subMat4 = new int[100][25];
        int cont = -1;
        int cont1 = -1;
        int cont2 = -1;
        int cont3 = -1;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m1[i][j] = randon.nextInt(10);
                m2[i][j] = randon.nextInt(10);
                res[i][j] = (m1[i][j] + m2[i][j]);
            }
        }
        
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                subMat1[i][j] = res[i][j];
            }
        }
        for (int i = 0; i < 50; i++) {
       
            for (int j = 25; j < 50; j++) {
                cont++;
                subMat2[i][cont] = res[i][j];
            }
            cont=-1;
        }
        for (int i = 0; i < 75; i++) {
  
            for (int j = 50; j < 75; j++) {
                cont1++;
                subMat3[i][cont1] = res[i][j];
            }
            cont1=-1;
        }
        for (int i = 0; i < 100; i++) {

            for (int j = 75; j < 100; j++) {
                cont2++;
                subMat4[i][cont2] = res[i][j];
            }
            cont2=-1;
        }


        System.out.println("Matriz 1");
        mostrarMatriz(m1);
        System.out.println("Matriz 2");
        mostrarMatriz(m2);
        System.out.println("Respuesta");
        mostrarMatriz(res);

        
        System.out.println("SubMatriz1");
        mostrarMatriz(subMat1);
        System.out.println("SubMatriz2");
        mostrarMatriz(subMat2);
        System.out.println("SubMatriz3");
        mostrarMatriz(subMat3);
        System.out.println("SubMatriz4");
        mostrarMatriz(subMat4);

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
