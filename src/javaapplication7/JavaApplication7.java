/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author ICABOA
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
                    Habitacional habitacional = (Habitacional) arr[i];

    public boolean masEstacionamientos() {
        for (int i = 0; i > arr.length; i++) {
            if (arr[i] instanceof Habitacional) {
                Habitacional habitacional = (Habitacional) arr[i];
                if (habitacional.dormitorios() < habitacional.estacionamientos()) {
                    return true;
                }
            }
        }
    }
}
