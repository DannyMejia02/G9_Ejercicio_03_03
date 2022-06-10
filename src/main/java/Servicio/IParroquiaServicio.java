/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Parroquia;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public interface IParroquiaServicio {
    
    public Parroquia crear(Parroquia parroquia);
    public List<Parroquia> listar();
    
}
