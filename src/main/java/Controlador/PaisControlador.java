/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pais;
import Servicio.PaisServicio;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public class PaisControlador {
    
    private final PaisServicio paisServicio = new PaisServicio();
    
    public Pais crear(String [] args){
         var nombre = args[0];
         var economia = args[1];
         var poblacion = Integer.valueOf(args[2]);
         var esDesarrollado = args[3];
         var cultura = args[4];
         
         var pais = new Pais(nombre,economia,poblacion,esDesarrollado, cultura);
         this.paisServicio.crear(pais);
         return pais;
    }
    
    public List<Pais> listar(){
        return this.paisServicio.listar();
    }
    
}
