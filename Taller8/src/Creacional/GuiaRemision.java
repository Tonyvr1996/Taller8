/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacional;

import java.time.LocalDate;
import java.util.ArrayList;
import Estructural.Adicionales;

/**
 *
 * @author Tony
 */
public class GuiaRemision extends ComprobanteElectronico {
    private String destino;
    private String placaVehiculo;
    private ArrayList<String> listaProductos;
    
    public GuiaRemision(){  
        setDescripcionComprobante("Guia Remisión");
    }

    public GuiaRemision(String destino, String placaVehiculo, ArrayList<String> listaProductos) {
        this.destino = destino;
        this.placaVehiculo = placaVehiculo;
        this.listaProductos = listaProductos;
    }

    public GuiaRemision(String destino, String placaVehiculo, ArrayList<String> listaProductos, String detallesEmisor, String numeroAutorización, String claveAcceso, LocalDate fecha, String descripcionComprobante, Adicionales ad) {
        super(detallesEmisor, numeroAutorización, claveAcceso, fecha, descripcionComprobante, ad);
        this.destino = destino;
        this.placaVehiculo = placaVehiculo;
        this.listaProductos = listaProductos;
    }

    
    
//    public GuiaRemision(String destino, String placaVehiculo, ArrayList<String> listaProductos) {
//        this.destino = destino;
//        this.placaVehiculo = placaVehiculo;
//        this.listaProductos = listaProductos;
//    }
//
//    public GuiaRemision(String destino, String placaVehiculo, ArrayList<String> listaProductos, String detallesEmisor, String numeroAutorización, String claveAcceso, LocalDate fecha) {
//        super(detallesEmisor, numeroAutorización, claveAcceso, fecha);
//        this.destino = destino;
//        this.placaVehiculo = placaVehiculo;
//        this.listaProductos = listaProductos;
//    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public ArrayList<String> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<String> listaProductos) {
        this.listaProductos = listaProductos;
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
    
    public String getDescripcion(){
        return "Guia Remision";
    }
    
    
}
