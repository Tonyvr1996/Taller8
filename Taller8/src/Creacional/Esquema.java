/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacional;

/**
 *
 * @author Yoselin
 */
public abstract class Esquema {
    private String modoEsquema;

    public abstract void generarNumeroAutorizacion(ComprobanteElectronico c);
    
    public String getModoEsquema() {
        return modoEsquema;
    }

    public void setModoEsquema(String modoEsquema) {
        this.modoEsquema = modoEsquema;
    }
    
    
    
}
