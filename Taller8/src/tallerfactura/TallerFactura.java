/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerfactura;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Yoselin
 */
public class TallerFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          double valorEntero = Math.floor(Math.random()*(5000000-10000000+1)+10000000);
          System.out.println(valorEntero);
          
          LocalDate d=LocalDate.of(2017, Month.MARCH, 1);
          System.out.println(d);

    }
    
}
