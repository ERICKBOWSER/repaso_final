/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repesca1_7;

import ejer1.Deportivo;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ERICK
 */
public class Ficheros {
    public static List<Deportivos> leerInstalaciones(String nombre) {
        List<String> lineas=new ArrayList<>();
        String tokens[];
        // Parseamos la fecha para que tenga el formato deseado
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        List<Deportivos> lista = new ArrayList();
        try {
            lineas = Files.readAllLines(Paths.get(nombre),
                    StandardCharsets.ISO_8859_1);
//            for (int i = 0; i < lineas.size(); i++) {
//                lineas.get(i).
//            }
            int contador = 0;
            for (String linea : lineas) {
                tokens = linea.split(","); 
                
                // Instancia para añadir un deportivo con cada repetición del bucle 
                Deportivos d = new Deportivos();
                
//                int cont = 0;
//                for (String token : tokens) {
//                    System.out.print(cont);
//                    cont++;
//                }
                
                if(contador > 0){
//                    d.setCodIDA(Integer.parseInt(tokens[0]));
                    if(tokens[0].isEmpty()){
                        d.setCodIDA(0);
                    }else{
                        d.setCodIDA(Integer.parseInt(tokens[0]));
                    }
                    
                    if(tokens[1].isEmpty()){
                        d.setNombreInst("");
                    }else{
                        d.setNombreInst(tokens[1]);
                    }
                    
                    if(tokens[2].isEmpty()){
                       d.setProvincia("");
                    }else{
                        d.setProvincia(tokens[2]);
                    }
                    
                    if(tokens[3].isEmpty()){
                        d.setMunicipio("");
                    }else{
                        d.setMunicipio(tokens[3]);
                    }
                    if(tokens[4].isEmpty()){
                        d.setVia("");
                    }else{
                        d.setVia(tokens[4]);
                    }
                    if(tokens[5].isEmpty()){
                        d.setCp("");
                    }else{
                         d.setCp(tokens[5]);
                    }
                    if(tokens[6].isEmpty()){
                        d.setEspDeportivo("");
                    }else{
                      d.setEspDeportivo(tokens[6]);  
                    }
                    
//                    d.setNombreInst(tokens[1]);
//                    d.setProvincia(tokens[2]);
//                    d.setMunicipio(tokens[3]);
//                    d.setVia(tokens[4]);
////                    if(tokens[5].isEmpty()){
////                        d.setCp(0);
////                    }else{
////                        d.setCp(Integer.parseInt(tokens[5]));
////                    }
//                    d.setCp(tokens[5]);
//
//                    d.setEspDeportivo(tokens[6]);
                    
                    
                    // Añadimos los datos a la lista
                    lista.add(d);
                }else{
                    contador++;
                }
            }
    
            System.out.println(lineas);
            
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
//        for (String linea : lineas) {
//            System.out.println(linea);
//        }
        return lista;
    }
}
