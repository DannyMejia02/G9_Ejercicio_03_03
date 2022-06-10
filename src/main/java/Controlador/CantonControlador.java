/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Canton;
import Servicio.CantonServicio;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public class CantonControlador {
    
    private final CantonServicio cantonServicio = new CantonServicio();
    
    public Canton crear(String [] args){
         var nombre = args[0];
         var clima = args[1];
         var poblacion = Integer.valueOf(args[2]);
         var tradicion = args[3];
         var pais = args[4];
         
         var auto = new Canton(nombre,clima,poblacion,tradicion, pais);
         this.cantonServicio.crear(auto);
         return auto;
    }
    
    public List<Canton> listar(){
        return this.cantonServicio.listar();
    }
    
}
