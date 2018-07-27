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
public class NotaCredito extends ComprobanteElectronico{
    private String cliente;
    private String codigoComprabante;
    private String detalleModificacion;
    private double valorPagar;

    public NotaCredito(){
        setDescripcionComprobante("NotadeCredito");
    }

    public NotaCredito(String cliente, String codigoComprabante, String detalleModificacion, double valorPagar) {
        this.cliente = cliente;
        this.codigoComprabante = codigoComprabante;
        this.detalleModificacion = detalleModificacion;
        this.valorPagar = valorPagar;
    }

    public NotaCredito(String cliente, String codigoComprabante, String detalleModificacion, double valorPagar, String detallesEmisor, String numeroAutorización, String claveAcceso, LocalDate fecha, String descripcionComprobante,Adicionales ad) {
        super(detallesEmisor, numeroAutorización, claveAcceso, fecha, descripcionComprobante,ad);
        this.cliente = cliente;
        this.codigoComprabante = codigoComprabante;
        this.detalleModificacion = detalleModificacion;
        this.valorPagar = valorPagar;
    }
           
//    public NotaCredito(String cliente, String codigoComprabante, String detalleModificacion, double valorPagar) {
//        this.cliente = cliente;
//        this.codigoComprabante = codigoComprabante;
//        this.detalleModificacion = detalleModificacion;
//        this.valorPagar = valorPagar;
//    }
//
//    public NotaCredito(String cliente, String codigoComprabante, String detalleModificacion, double valorPagar, String detallesEmisor, String numeroAutorización, String claveAcceso, LocalDate fecha) {
//        super(detallesEmisor, numeroAutorización, claveAcceso, fecha);
//        this.cliente = cliente;
//        this.codigoComprabante = codigoComprabante;
//        this.detalleModificacion = detalleModificacion;
//        this.valorPagar = valorPagar;
//    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCodigoComprabante() {
        return codigoComprabante;
    }

    public void setCodigoComprabante(String codigoComprabante) {
        this.codigoComprabante = codigoComprabante;
    }

    public String getDetalleModificacion() {
        return detalleModificacion;
    }

    public void setDetalleModificacion(String detalleModificacion) {
        this.detalleModificacion = detalleModificacion;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
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
    
    
    
}
