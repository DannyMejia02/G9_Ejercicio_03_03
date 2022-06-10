/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Parroquia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public class ParroquiaServicio implements IParroquiaServicio {
    
    private static List<Parroquia> parroquiaList = new ArrayList<>();

    @Override
    public Parroquia crear(Parroquia parroquia) {
       this.parroquiaList.add(parroquia);
       return parroquia;
    }

    @Override
    public List<Parroquia> listar() {
        return this.parroquiaList;
        
    }
    
    
    
        
    
}
