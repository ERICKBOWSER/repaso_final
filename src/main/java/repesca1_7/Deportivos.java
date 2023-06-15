/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repesca1_7;

/**
 *
 * @author ERICK
 */
public class Deportivos {
    private int codIDA;
    private String nombreInst;
    private String provincia;
    private String municipio;
    private String via;
    private String cp;
    private String espDeportivo;

    public int getCodIDA() {
        return codIDA;
    }

    public void setCodIDA(int codIDA) {
        this.codIDA = codIDA;
    }

    public String getNombreInst() {
        return nombreInst;
    }

    public void setNombreInst(String nombreInst) {
        this.nombreInst = nombreInst;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getEspDeportivo() {
        return espDeportivo;
    }

    public void setEspDeportivo(String espDeportivo) {
        this.espDeportivo = espDeportivo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(codIDA);
        sb.append(nombreInst);
        sb.append(provincia);
        sb.append(municipio);
        sb.append(via);
        sb.append(cp);
        sb.append(espDeportivo);
        return sb.toString();
    }
    
    
    
    
}
