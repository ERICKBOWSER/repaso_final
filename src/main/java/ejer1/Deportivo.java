/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejer1;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author ERICK
 */
public class Deportivo {

    private String apellidos;
    private String nombre;
    private String dni;
    private String tipoPersonal;
    private String puestoTrabajo;
    private boolean horarioPersonal;
    private String fechaAlta;
    private String fechaBaja;
    private String horasIniciales;
    private String totalHoras;
    private boolean activo;

    public Deportivo(){
        
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(String tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public boolean isHorarioPersonal() {
        return horarioPersonal;
    }

    public void setHorarioPersonal(boolean horarioPersonal) {
        this.horarioPersonal = horarioPersonal;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getHorasIniciales() {
        return horasIniciales;
    }

    public void setHorasIniciales(String horasIniciales) {
        this.horasIniciales = horasIniciales;
    }

    public String getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(String totalHoras) {
        this.totalHoras = totalHoras;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(apellidos).append(";");
        sb.append(nombre).append(";");
        sb.append(dni).append(";");
        sb.append(tipoPersonal).append(";");
        sb.append(puestoTrabajo).append(";");
        sb.append(horarioPersonal).append(";");
        sb.append(fechaAlta).append(";");
        sb.append(fechaBaja).append(";");
        sb.append(horasIniciales).append(";");
        sb.append(totalHoras).append(";");
        sb.append(activo).append(";");
        return sb.toString();
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    
}
