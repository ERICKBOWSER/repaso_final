/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repesca1_7;

import java.util.List;
import java.util.Map;

/**
 *
 * @author ERICK
 */
public class Main {
    public static void main(String[] args) {
        List<Deportivos> lista = Ficheros.leerInstalaciones("censo_instalaciones_deportivas.csv");
        
        for (Deportivos deportivos : lista) {
            System.out.println(deportivos);
        }
        
        Map<String, Integer> mapContador =  Ficheros.numInstalaciones(lista);
        
        for (Map.Entry<String, Integer> entry : mapContador.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key + ": " + val);
        }
        
    }
}
