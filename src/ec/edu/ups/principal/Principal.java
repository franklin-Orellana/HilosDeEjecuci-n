/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principal;

import java.util.Scanner;
import ec.edu.ups.hilos.Corredor;

/**
 *
 * @author Fernanda
 */
public class Principal {

    public static void main(String[] args) {
        Corredor corredor = new Corredor();
        corredor.Matriz();
    }
/*
        Corredor corredor1 = new Corredor("matriz1", 0);
        Corredor corredor2 = new Corredor("matriz2", 0);
        Corredor corredor3 = new Corredor("matriz3", 0);
        Corredor corredor4 = new Corredor("matriz4", 0);
        System.out.println("Inicia carrera");
        
        Thread hilo1 = new Thread(corredor1);
        Thread hilo2 = new Thread(corredor2);
        Thread hilo3 = new Thread(corredor3);
        Thread hilo4 = new Thread(corredor4);
        
        hilo1.setPriority(2);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
        System.out.println("Finaliza carrera");

    }
*/
}
