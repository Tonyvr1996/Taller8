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
public class Online extends Esquema {

    @Override
    public void generarNumeroAutorizacion(ComprobanteElectronico c) {
        double valorEntero = Math.floor(Math.random()*(5000000-10000000+1)+10000000);
        ComprobanteElectronico.numeroAutorizacion=""+valorEntero;
        System.out.println("   Esquema online escogido...");
        System.out.println("Generando número de autorización para "+c.getDescripcionComprobante());
    }
    
}
