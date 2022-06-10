/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Parroquia;
import Servicio.ParroquiaServicio;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public class ParroquiaControlador {
    
    private final ParroquiaServicio parroquiaServicio = new ParroquiaServicio();
    
    public Parroquia crear(String [] args){
         var nombre = args[0];
         var habitantes = Integer.valueOf(args[1]);
         var sistemaVial = args[2];
         var estructura = args[3];
         var habitos = args[4];
         var canton = args[5];
         
         var parroquia = new Parroquia(nombre,habitantes,sistemaVial,estructura,habitos,canton);
         this.parroquiaServicio.crear(parroquia);
         return parroquia;
    }
    
    public List<Parroquia> listar(){
        return this.parroquiaServicio.listar();
    }
    
    
}
