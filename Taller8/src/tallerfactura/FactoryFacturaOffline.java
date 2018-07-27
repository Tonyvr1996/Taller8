/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerfactura;

/**
 *
 * @author Yoselin
 */
public class FactoryFacturaOffline extends ComprobanteElectronicoAbstractFactory {

    @Override
    public ComprobanteElectronico emitirComprobante() {
        return new Factura();
    }

    @Override
    public Esquema crearEsquema() {
        return new Offline();
    }
    
}
