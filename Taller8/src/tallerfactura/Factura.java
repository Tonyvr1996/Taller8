/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerfactura;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Yoselin
 */
public class Factura extends ComprobanteElectronico {
    private String nombreCliente;
    private String codigo;
    private ArrayList<String> listaProductos;
    private double total;

    public Factura(){
        setDescripcionComprobante("Factura");
    }

    public Factura(String nombreCliente, String codigo, ArrayList<String> listaProductos, double total) {
        this.nombreCliente = nombreCliente;
        this.codigo = codigo;
        this.listaProductos = listaProductos;
        this.total = total;
    }

    public Factura(String nombreCliente, String codigo, ArrayList<String> listaProductos, double total, String detallesEmisor, String numeroAutorización, String claveAcceso, LocalDate fecha, String descripcionComprobante) {
        super(detallesEmisor, numeroAutorización, claveAcceso, fecha, descripcionComprobante);
        this.nombreCliente = nombreCliente;
        this.codigo = codigo;
        this.listaProductos = listaProductos;
        this.total = total;
    }
    
    
    
//    public Factura(String nombreCliente, String codigo, ArrayList<String> listaProductos, double total) {
//        this.nombreCliente = nombreCliente;
//        this.codigo = codigo;
//        this.listaProductos = listaProductos;
//        this.total = total;
//    }
//
//    public Factura(String nombreCliente, String codigo, ArrayList<String> listaProductos, double total, String detallesEmisor, String numeroAutorización, String claveAcceso, LocalDate fecha) {
//        super(detallesEmisor, numeroAutorización, claveAcceso, fecha);
//        this.nombreCliente = nombreCliente;
//        this.codigo = codigo;
//        this.listaProductos = listaProductos;
//        this.total = total;
//    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<String> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<String> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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
