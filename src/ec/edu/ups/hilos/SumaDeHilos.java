/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.hilos;

/**
 *
 * @author Fernanda
 */
public class SumaDeHilos extends Thread{
    private int[][] matrizA;
    private int[][] matrizB;
    private int[][]matrizR;
    int aux1,aux2;

    public SumaDeHilos(int[][] matrizA, int[][] matrizB,int matrizR[][], int aux1,int aux2) {
        this.aux1=aux1;
        this.aux2=aux2;
        this.matrizR=matrizR;
        this.matrizA = matrizA;
        this.matrizB = matrizB;
        
        
    }
 
    @Override
    public void run() {
        for(int i =aux1;i<aux2;i++){
            for(int j=0;j<matrizR[i].length;j++){
                matrizR[i][j]=matrizA[i][j]+matrizB[i][j];
            }
        }
    }
    
}
