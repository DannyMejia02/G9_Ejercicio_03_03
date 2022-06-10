/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author marisolzhizhpon
 */
public class Parroquia {
    private String nombre;
    private int habitantes;
    private String sistemaVial;
    private String estructura;
    private String habitos;
    private String canton;

    public Parroquia(String nombre, int habitantes, String sistemaVial, String estructura, String habitos, String canton) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.sistemaVial = sistemaVial;
        this.estructura = estructura;
        this.habitos = habitos;
        this.canton = canton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getSistemaVial() {
        return sistemaVial;
    }

    public void setSistemaVial(String sistemaVial) {
        this.sistemaVial = sistemaVial;
    }

    public String getEstructura() {
        return estructura;
    }

    public void setEstructura(String estructura) {
        this.estructura = estructura;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    @Override
    public String toString() {
        return "Parroquia{" + "nombre=" + nombre + ", habitantes=" + habitantes + ", sistemaVial=" + sistemaVial + ", estructura=" + estructura + ", habitos=" + habitos + ", canton=" + canton + '}';
    }
    
    
    
}
