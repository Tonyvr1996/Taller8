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
public class Main {
    
    public static void main(String [] args){
        
        ComprobanteElectronicoAbstractFactory c1=new FactoryFacturaOnline();
        FacturadorElectronico e= new FacturadorElectronico(c1);
        
        ComprobanteElectronicoAbstractFactory c2=new FactoryFacturaOffline();
        FacturadorElectronico e2=new FacturadorElectronico(c2);
    }

}
