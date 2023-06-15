/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ERICK
 */
public class Ficheros {
     public static List<Deportivo> leer(String nombre) {
        List<String> lineas=new ArrayList<>();
        String tokens[];
        // Parseamos la fecha para que tenga el formato deseado
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        List<Deportivo> lista = new ArrayList();
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
                Deportivo d = new Deportivo();
                
                if(contador > 0){
                    d.setApellidos(tokens[0]);
                    d.setNombre(tokens[1]);
                    d.setDni(tokens[2]);
                    d.setTipoPersonal(tokens[3]);
                    d.setPuestoTrabajo(tokens[4]);
                    
                    // PREGUNTA PARA VICO
                    if(!tokens[5].equalsIgnoreCase("Si")){
                        d.setHorarioPersonal(false);
                    }else{
                        d.setHorarioPersonal(true);
                    }
                    
                    
//                    d.setFechaAlta(LocalDate.parse(tokens[6], formato));
                    d.setFechaAlta(tokens[6]);
                    
//                    if(!tokens[7].equals("")){
//                       LocalDate fecha = LocalDate.parse(tokens[7], formato);
//                       d.setFechaBaja(fecha);
//                    }else{
//                        d.setFechaBaja(null);
//                    }
                    d.setFechaBaja(tokens[7]);

//                    d.setHorasIniciales(LocalTime.parse(tokens[7]));
                    d.setHorasIniciales(tokens[8]);
                    
                    d.setTotalHoras(tokens[9]);                   
                    
                    
                    if(tokens[10].equalsIgnoreCase("S")){
                        d.setActivo(true);
                    }else{
                        d.setActivo(false);
                    }
                    
                    // Añadimos los datos a la lista
                    lista.add(d);
                }else{
                    contador++;
                }
            }
    
//            System.out.println(lineas);
            
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
//        for (String linea : lineas) {
//            System.out.println(linea);
//        }
        return lista;
    }
     
    public static void escribirJSON(Map<String, Integer> map, String nombre) throws IOException{
         ObjectMapper mapeador = new ObjectMapper();
        
        // Permite a mapeador usar fechas según java time
        mapeador.registerModule(new JavaTimeModule());
        
        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        // Escribe en un fichero JSON el catálogo de muebles
        mapeador.writeValue(new File(nombre), map);
    }
    
}
