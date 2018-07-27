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
public abstract class ComprobanteElectronicoAbstractFactory {
    public abstract ComprobanteElectronico emitirComprobante();
    public abstract Esquema crearEsquema();
}
