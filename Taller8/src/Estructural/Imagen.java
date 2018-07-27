/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructural;

import Creacional.ComprobanteElectronico;
import Creacional.ComprobanteElectronicoDecorator;

/**
 *
 * @author Tony
 */
public class Imagen extends ComprobanteElectronicoDecorator {
    
    public Imagen(Adicionales a){
        super(a);
    }
    
    public String getImagen(){
        return "Imagen establecida correctamente";
    }

    @Override
    public String descripcion() {
        return "Imagen establecida correctamente";
    }
    
}
