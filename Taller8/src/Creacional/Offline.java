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
public class Offline extends Esquema {

    @Override
    public void generarNumeroAutorizacion(ComprobanteElectronico c) {
        ComprobanteElectronico.numeroAutorizacion=ComprobanteElectronico.claveAcceso;
        System.out.println("   Esquema offline escogido...");
        System.out.println("Generando número de autorización para "+c.getDescripcionComprobante());
    }
    
}
