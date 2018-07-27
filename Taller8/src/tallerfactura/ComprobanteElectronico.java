/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerfactura;

import java.time.LocalDate;

/**
 *
 * @author Yoselin
 */
public class ComprobanteElectronico implements Cloneable{
    private String detallesEmisor;
    public static String numeroAutorizacion;
    public static String claveAcceso;
    private LocalDate fecha;
    private String descripcionComprobante;
    
    public ComprobanteElectronico(){
    }

    public ComprobanteElectronico(String detallesEmisor,String numeroAutorización,String claveAcceso ,LocalDate fecha,String descripcionComprobante) {
//        this.detallesEmisor = detallesEmisor;
//        this.numeroAutorizacion=numeroAutorizacion;
//        this.claveAcceso=claveAcceso;
//        this.fecha = fecha;
          setDetallesEmisor(detallesEmisor);
          setNumeroAutorizacion(numeroAutorización);
          setClaveAcceso(claveAcceso);
          setFecha(fecha);
          setDescripcionComprobante(descripcionComprobante);

    }

    public String getDescripcionComprobante() {
        return descripcionComprobante;
    }

    public void setDescripcionComprobante(String descripcionComprobante) {
        this.descripcionComprobante = descripcionComprobante;
    }

    
    
    public String getDetallesEmisor() {
        return detallesEmisor;
    }

    public void setDetallesEmisor(String detallesEmisor) {
        this.detallesEmisor = detallesEmisor;
    }

    public static String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    public static void setNumeroAutorizacion(String numeroAutorizacion) {
        ComprobanteElectronico.numeroAutorizacion = numeroAutorizacion;
    }

    public static String getClaveAcceso() {
        return claveAcceso;
    }

    public static void setClaveAcceso(String claveAcceso) {
        ComprobanteElectronico.claveAcceso = claveAcceso;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
