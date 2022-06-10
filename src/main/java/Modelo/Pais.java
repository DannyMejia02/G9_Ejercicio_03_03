/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author marisolzhizhpon
 */
public class Pais {
    private String nombre;
    private String economia;
    private int poblacion;
    private String esDesarrollado;
    private String cultura;

    public Pais(String nombre, String economia, int poblacion, String esDesarrollado, String cultura) {
        this.nombre = nombre;
        this.economia = economia;
        this.poblacion = poblacion;
        this.esDesarrollado = esDesarrollado;
        this.cultura = cultura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEconomia() {
        return economia;
    }

    public void setEconomia(String economia) {
        this.economia = economia;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getEsDesarrollado() {
        return esDesarrollado;
    }

    public void setEsDesarrollado(String esDesarrollado) {
        this.esDesarrollado = esDesarrollado;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", economia=" + economia + ", poblacion=" + poblacion + ", esDesarrollado=" + esDesarrollado + ", cultura=" + cultura + '}';
    }
    
    

    
    
}
