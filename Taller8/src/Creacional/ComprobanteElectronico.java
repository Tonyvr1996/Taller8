/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacional;

import java.time.LocalDate;
import Estructural.Adicionales;

/**
 *
 * @author Tony
 */
public class ComprobanteElectronico implements Cloneable,Adicionales{
    private String detallesEmisor;
    public static String numeroAutorizacion;
    public static String claveAcceso;
    private LocalDate fecha;
    private String descripcionComprobante;
    private Adicionales ad;

    public Adicionales getAd() {
        return ad;
    }

    public void setAd(Adicionales ad) {
        this.ad = ad;
    }
    
    public ComprobanteElectronico(){
    }

    public ComprobanteElectronico(Adicionales ad){
        setAd(ad);
    }
    
    public ComprobanteElectronico(String detallesEmisor,String numeroAutorización,String claveAcceso ,LocalDate fecha,String descripcionComprobante,Adicionales ad) {
//        this.detallesEmisor = detallesEmisor;
//        this.numeroAutorizacion=numeroAutorizacion;
//        this.claveAcceso=claveAcceso;
//        this.fecha = fecha;
          setDetallesEmisor(detallesEmisor);
          setNumeroAutorizacion(numeroAutorización);
          setClaveAcceso(claveAcceso);
          setFecha(fecha);
          setDescripcionComprobante(descripcionComprobante);
          setAd(ad);

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

    @Override
    public String descripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
