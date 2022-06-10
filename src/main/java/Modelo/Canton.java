/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author marisolzhizhpon
 */
public class Canton {
    private String nombre;
    private String clima;
    private int poblacion;
    private String tradicion;
    private String pais;

    public Canton(String nombre, String clima, int poblacion, String tradicion, String pais) {
        this.nombre = nombre;
        this.clima = clima;
        this.poblacion = poblacion;
        this.tradicion = tradicion;
        this.pais = pais;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getTradicion() {
        return tradicion;
    }

    public void setTradicion(String tradicion) {
        this.tradicion = tradicion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Canton{" + "nombre=" + nombre + ", clima=" + clima + ", poblacion=" + poblacion + ", tradicion=" + tradicion + ", pais=" + pais + '}';
    }
    
    
    
}
