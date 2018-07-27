/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructural;

import Creacional.ComprobanteElectronico;

/**
 *
 * @author Yoselin
 */
public class Imagen extends ComprobanteElectronico {
    
    public Imagen(Adicionales a){
        super(a);
    }
    
    public String getImagen(){
        return "Imagen establecida correctamente";
    }
    
}
