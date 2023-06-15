/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ERICK
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<Deportivo> lista =  Ficheros.leer("RelEmpCenAus.csv");
        
        for (Deportivo deportivo : lista) {
            System.out.println(deportivo);
        }
        System.out.println("Instalaciones deportivas: ");
        System.out.println(contInstalaciones(lista));
        
        Ficheros.escribirJSON(contInstalaciones(lista), "intalaciones.json");
        
    }
    
    public static Map<String, Integer> contInstalaciones(List<Deportivo> lista){
        Map<String, Integer> map = new HashMap();
        
//        long contador = lista.stream()
//                .filter(l1 -> l1.getPuestoTrabajo().contains("Educación Física P.E.S."))
//                .count();
        
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getPuestoTrabajo().contains("Educación Física P.E.S.")){
                contador++;
            }
        }

        map.put("Málaga", contador);
        
        return map;
        
    }
    
}
