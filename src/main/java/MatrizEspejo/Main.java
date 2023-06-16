/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatrizEspejo;

/**
 *
 * @author ERICK
 */
public class Main {
    public static void main(String[] args) {
        int[][] matriz = Ficheros.leerM("MatrizP.txt", ",");
        
        Ficheros.mostrarMatriz(matriz);
        
        Ficheros.ordenInvertido(matriz);
        
//        Ficheros.mostrarMatriz(matrizInvertido);
        
    }
}
