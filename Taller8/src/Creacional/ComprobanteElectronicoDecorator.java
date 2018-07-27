/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacional;

import Estructural.Adicionales;

/**
 *
 * @author Yoselin
 */
public abstract class ComprobanteElectronicoDecorator implements Adicionales {

    private Adicionales adicionales;
    
    public ComprobanteElectronicoDecorator(Adicionales adicionales){
        setAdicionales(adicionales);
    }

    public Adicionales getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(Adicionales adicionales) {
        this.adicionales = adicionales;
    }
    
    
    
}
