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
public class Lema extends ComprobanteElectronicoDecorator {
    
    public Lema(Adicionales a){
        super(a);
    }
    
    public String getDescripcion(){
        return "Ni un paso atrás";
    }

    @Override
    public String descripcion() {
        return "Ni un paso atrás";

    }
}
