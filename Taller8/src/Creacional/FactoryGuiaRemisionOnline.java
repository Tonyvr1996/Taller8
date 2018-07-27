/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacional;

/**
 *
 * @author Tony
 */
public class FactoryGuiaRemisionOnline extends ComprobanteElectronicoAbstractFactory {

    @Override
    public ComprobanteElectronico emitirComprobante() {
        return new GuiaRemision();
    }

    @Override
    public Esquema crearEsquema() {
        return new Online();
    }
    
}
