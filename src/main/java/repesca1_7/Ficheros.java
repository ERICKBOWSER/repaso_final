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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                    if(tokens.length == 6){ // Hay que tener cuidado con el length() ya que cuenta desde 0
                        d.setCodIDA(Integer.parseInt(tokens[0]));
                        d.setNombreInst(tokens[1]);
                        d.setProvincia(tokens[2]);
                        d.setMunicipio(tokens[3]);
                        d.setVia(tokens[4]);
                        d.setCp(tokens[5]);
                        d.setEspDeportivo("");
                    }
                    
                    if(tokens.length == 7){
                        d.setCodIDA(Integer.parseInt(tokens[0]));
                        d.setNombreInst(tokens[1]);
                        d.setProvincia(tokens[2]);
                        d.setMunicipio(tokens[3]);
                        d.setVia(tokens[4]);
                        d.setCp(tokens[5]);
                        d.setEspDeportivo(tokens[6]);
                    }
                    
                    if(tokens.length == 8){
                        d.setCodIDA(Integer.parseInt(tokens[0]));
                        d.setNombreInst(tokens[1]);
                        d.setProvincia(tokens[2]);
                        d.setMunicipio(tokens[3]);
                        d.setVia(tokens[4] + tokens[5]);
                        d.setCp(tokens[6]);
                        d.setEspDeportivo(tokens[7]);
                    }
                    
                    if(tokens.length == 9){
                        d.setCodIDA(Integer.parseInt(tokens[0]));
                        d.setNombreInst(tokens[1]);
                        d.setProvincia(tokens[2]);
                        d.setMunicipio(tokens[3]);
                        d.setVia(tokens[4] + tokens[5] + tokens[6]);
                        d.setCp(tokens[7]);
                        d.setEspDeportivo(tokens[8]);
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
    
    public static Map<String, Integer> numInstalaciones(List<Deportivos> l){
        Map<String, Integer> map = new HashMap();
        
        for (Deportivos deportivos : l) {
            if(map.containsKey(deportivos.getNombreInst())){
                int contador = map.get(deportivos.getNombreInst()) + 1;
                map.put(deportivos.getNombreInst(), contador);
            }else{
                map.put(deportivos.getNombreInst(), 1);
            }
        }
        
        return map;
        
    }
    
    
}
