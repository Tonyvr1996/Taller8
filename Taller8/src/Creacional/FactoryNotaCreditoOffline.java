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
public class FactoryNotaCreditoOffline extends ComprobanteElectronicoAbstractFactory {

    @Override
    public ComprobanteElectronico emitirComprobante() {
        return new NotaCredito();
    }

    @Override
    public Esquema crearEsquema() {
        return new Offline();
    }
    
}
