/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Creacional.FactoryFacturaOffline;
import Creacional.FacturadorElectronico;
import Creacional.ComprobanteElectronicoAbstractFactory;
import Creacional.FactoryFacturaOnline;
import Creacional.FactoryGuiaRemisionOffline;
import Creacional.FactoryGuiaRemisionOnline;
import Creacional.FactoryNotaCreditoOffline;
import Creacional.FactoryNotaCreditoOnline;
import Creacional.Factura;
import Estructural.Adicionales;
import Estructural.Imagen;
import Estructural.Lema;

/**
 *
 * @author Tony
 */
public class Main {
    
    public static void main(String [] args){
        
        //Podemos ir creando cada uno de nuestros comprobantes electrónicos
        //De acuerdo al esquema previamente esblecido
        
                            /*Factura*/
                             //Online
        ComprobanteElectronicoAbstractFactory c1=new FactoryFacturaOnline();
        FacturadorElectronico e= new FacturadorElectronico(c1);
        System.out.println("");
                            //Offline
        ComprobanteElectronicoAbstractFactory c2=new FactoryFacturaOffline();
        FacturadorElectronico e2=new FacturadorElectronico(c2);
        System.out.println("");

                            /*Guiade Remisión*/
                            //Online
        ComprobanteElectronicoAbstractFactory c3=new FactoryGuiaRemisionOnline();
        FacturadorElectronico e3= new FacturadorElectronico(c3);
        System.out.println("");
              
                            /*Nota de crédito*/
                            //Online 
        ComprobanteElectronicoAbstractFactory c5=new FactoryNotaCreditoOnline();
        FacturadorElectronico e5= new FacturadorElectronico(c5);
        System.out.println("");
                            //Offline
        ComprobanteElectronicoAbstractFactory c6=new FactoryNotaCreditoOffline();
        FacturadorElectronico e6=new FacturadorElectronico(c6);
        System.out.println("");
        
                          /*Agregamos la imagen del logo*/
        Adicionales comprobanteElectronico=new Factura();      
        comprobanteElectronico=new Imagen(comprobanteElectronico);
        System.out.println(comprobanteElectronico.descripcion());
        
    }

}
