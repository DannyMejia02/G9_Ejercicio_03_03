/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Pais;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public interface IPaisServicio {
    
    public Pais crear(Pais pais);
    public List<Pais> listar();
    
}
