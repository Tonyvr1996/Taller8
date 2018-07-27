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
public class FacturadorElectronico {
    
    public FacturadorElectronico(ComprobanteElectronicoAbstractFactory factory){
        Esquema esquema=factory.crearEsquema();
        ComprobanteElectronico c=factory.emitirComprobante();
        esquema.generarNumeroAutorizacion(c);
    }
    
}
