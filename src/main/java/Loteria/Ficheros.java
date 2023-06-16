/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loteria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Ficheros {

    public static void leer(String nombre) {

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        System.out.println("Leyendo el fichero: " + nombre);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(nombre), "US-ASCII")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(" ");

                // Primer número
                String num1 = tokens[0];
                char[] nRes1 = new char[num1.length()];

//                System.out.println(num1);
//                System.out.println(nRes);
//                
                for (int i = 0; i < num1.length(); i++) {
                    nRes1[i] = num1.charAt(i);
                }
                System.out.println(nRes1);

                // Segundo número
                String num2 = tokens[1];
                char[] nRes2 = new char[num2.length()];

                for (int i = 0; i < num1.length(); i++) {
                    nRes2[i] = num2.charAt(i);
                }
                System.out.println(nRes2);

                int r = 0;

                System.out.println("\nOrdenado: ");                
                Arrays.sort(nRes2);
                
                System.out.println(nRes1);
                System.out.println(nRes2);

                for (int i = 0; i < nRes1.length; i++) {
                r += Arrays.binarySearch(nRes2, nRes1[i]);
                }
                System.out.println(r);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
