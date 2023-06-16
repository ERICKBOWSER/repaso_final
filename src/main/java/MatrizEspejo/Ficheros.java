package MatrizEspejo;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ERICK
 */
public class Ficheros {

    public static void leerMatriz(String nombre) {

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        
        String[][] matriz = null;

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(nombre), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(";");

                // Establecemos el largo de la fila
                matriz = new String[tokens.length][];

                for (int i = 0; i < tokens.length; i++) {

                    // Cogemos el largo y se lo damos a las columnas de la fila
                    // Usamos el largo de la fila, y le añadimos el número de columnas que va a tener
                    matriz[i] = new String[tokens[i].length()];

                    for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = String.valueOf(tokens[i].charAt(j));

                                        System.out.print(matriz[i][j]);
                    }
                                System.out.println("");
                }

//                for (String string : tokens) {
//                    System.out.print(string + "\t");
//                }
//                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static int[][] leerM(String nombre, String separador) {

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        int[][] matriz = null;
        int contador = 0;

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(nombre), "UTF-8")) {

            while (datosFichero.hasNextLine()) {
                datosFichero.nextLine(); // Para pasar a la siguiente linea

                contador++; // Nos servirá para definir el largo de las filas
            }

            matriz = new int[contador][]; // Establecemos el número de filas que tendrá
            datosFichero.close(); // Cerramos el scanner

            // Abrimos otro scanner y no hace falta try ya que va dentro del que ya tenemos 
            Scanner datosFichero2 = new Scanner(new File(nombre), "UTF-8");

            // hasNextLine devuelve true mientras haya líneas por leer
            int fila = 0;
            while (datosFichero2.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero2.nextLine();

                // Separamos cada dato
                tokens = linea.split(separador);

                // NO SE PUEDE COLOCAR UN BUCLE YA QUE TODAVÍA NO TENEMOS LA SIGUIENTE LINEA DE datosFichero2
//                for (int i = 0; i < tokens.length; i++) {

                    // Cogemos el largo del token y se lo damos a las columnas de la fila
                    matriz[fila] = new int[tokens.length];

                    for (int j = 0; j < tokens.length; j++) {
                      matriz[fila][j] = Integer.parseInt(tokens[j]);

                    }
                fila++;

//                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return matriz;
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) { //Así obtenemos lo que ocupa cada fila, para las columnas
                System.out.print(matriz[i][j] + " ");
            }

        }
    }
    
    public static void ordenInvertido(int[][] m) {

        int fila = m.length; // Total de filas
//        System.out.println("\n" + fila);
        
        int[] largoFilas = new int[fila]; // Establecemos el tamaño de filas que va a tener

        // Añadimos a cada fila el largo
        for (int i = 0; i < largoFilas.length; i++) {
            largoFilas[i] = m[i].length;
        }

        int[][] matrizInvertida = new int[fila][];

        System.out.println("\n Matriz espejo: ");
        for (int i = 0; i < fila; i++) {
            int largoFilaOriginal = largoFilas[i]; // Almacenamos en un entero el largo
            
//            System.out.println("LargoOriginal " + largoFilaOriginal);
            matrizInvertida[i] = new int[largoFilaOriginal]; // Establecemos el largo de cada columna

            System.out.println();
            for (int j = largoFilaOriginal - 1; j >= 0 ; j--) {
                matrizInvertida[i][j] = m[i][j];
                System.out.print(matrizInvertida[i][j] + " ");
            }
            
        }
//        return matrizInvertida;
    }
    
}
